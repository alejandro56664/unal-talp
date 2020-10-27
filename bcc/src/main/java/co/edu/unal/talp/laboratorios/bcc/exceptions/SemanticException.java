package co.edu.unal.talp.laboratorios.bcc.exceptions;

public class SemanticException extends Exception{
    private int line = -1, col = -1;
    public SemanticException(String msg){
        super(msg);
    }

    public void setPosition(int line, int col){
        this.line = line;
        this.col = col;
    }

    @Override
    public String toString(){
        String result;
        if(line + col > 0){
            result = String.format("Error semántico en <%d:%d>: %s", line, col, super.getMessage());
        } else {
            result = String.format("Error semántico: %s", super.getMessage());
        }
        return result;
    }
}
