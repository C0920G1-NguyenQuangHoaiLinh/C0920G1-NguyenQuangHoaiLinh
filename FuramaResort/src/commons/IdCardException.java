package commons;

public class IdCardException extends Exception {
    public IdCardException(String msg){
        super(msg);
    }
    public IdCardException(){
        super("cmnd phải có 9 chữ số ");
    }
}
