package co.edu.unal.talp.laboratorios.bcc.interpreter;

import co.edu.unal.talp.laboratorios.bcc.exceptions.InvalidArgsException;

import java.util.List;
import java.util.Map;

public class FunctionSpace<T> extends MemorySpace<T> {

    private final FunctionSymbol functionSymbol;

    public FunctionSpace(FunctionSymbol fs){
        super(fs.getName());
        functionSymbol = fs;
    }

    public FunctionSymbol getFunctionSymbol() {
        return functionSymbol;
    }

    public void load(List<T> args) throws InvalidArgsException {

        Map<String, String> myArgs = functionSymbol.getArgs();
        Map<String, String> myVars = functionSymbol.getVars();

        if(args.size() != myArgs.size()){
           throw new InvalidArgsException(functionSymbol.getName(), myVars);
        }
        
        //registramos los argumentos con sus valores y las variables de la función
        int i = 0;
        for (Map.Entry<String, String> arg:
             myArgs.entrySet()) {
             registerVar(arg.getKey(), arg.getValue(), args.get(i)); i++;
        }

        for (Map.Entry<String, String> var:
                myVars.entrySet()) {
            registerVar(var.getKey(), var.getValue());
        }
        
    }
}
