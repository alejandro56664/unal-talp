package co.edu.unal.talp.laboratorios.bcc.interpreter;

import co.edu.unal.talp.laboratorios.bcc.exceptions.VarAlreadyDeclaredException;
import co.edu.unal.talp.laboratorios.bcc.exceptions.VarNeverAssignedException;
import co.edu.unal.talp.laboratorios.bcc.exceptions.VarNotDeclaredException;

import java.util.HashMap;
import java.util.Map;

public class MemorySpace<T> {

    Map<String, Double> numVarTable;
    Map<String, Boolean> boolVarTable;
    Map<String, Object> varTypeTable;

    private final String name;

    public MemorySpace(String name) {
        this.name = name;
        numVarTable = new HashMap<>();
        boolVarTable = new HashMap<>();
        varTypeTable = new HashMap<>();
    }

    public void registerVar(String id, String type) throws VarAlreadyDeclaredException {
        registerVar(id, type,null);
    }

    public void registerVar(String id, String type, T value) throws VarAlreadyDeclaredException {
        if(varTypeTable.get(id) != null) throw new VarAlreadyDeclaredException(id);
        varTypeTable.put(id, type);
        updateVar(type, id, value);
    }



    public void updateVar(String id, Object value) throws VarNotDeclaredException{
        String type = (String) varTypeTable.get(id);
        checkType(id, type);
        updateVar(type, id, value);
    }



    public T getVarValue(String id) throws VarNotDeclaredException, VarNeverAssignedException {
        String type = (String) varTypeTable.get(id);
        checkType(id, type);
        T value = getVarValue(type, id);
        checkValue(id, value);
        return value;
    }

    private void checkValue(String id, T value) throws VarNeverAssignedException {
        if(value == null){
            throw new VarNeverAssignedException(id);
        }
    }

    private void checkType(String id, String type) throws VarNotDeclaredException {
        if (type == null) {
            throw new VarNotDeclaredException(id);
        }
    }

    private void updateVar(String type, String id, Object value) {
        switch (type) {
            case "bool":
                boolVarTable.put(id, (Boolean) coercionBoolean(value));
                break;
            case "num":
                numVarTable.put(id, (Double) coercionDouble(value));
                break;

        }
    }

    private Object coercionDouble(Object value) {
        if(value instanceof String){
            return Double.parseDouble((String)value);
        } else {
            return value;
        }
    }

    private Object coercionBoolean(Object value) {
        if(value instanceof String){
            return Boolean.parseBoolean((String)value);
        } else {
            return value;
        }
    }

    private T getVarValue(String type, String id) {
        T result;
        switch (type) {
            case "bool":
                result = (T) boolVarTable.get(id);
                break;
            case "num":
                result = (T) numVarTable.get(id);
                break;
            default:
                result = null;
                break;

        }
        return result;
    }

    public String getName() {
        return name;
    }
}
