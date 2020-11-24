package commons;

public class EmailException extends Exception {
    public EmailException(String msg){
        super(msg);
    }
    public EmailException(){
        super("email phải đúng định dạng abc@abc.com ");
    }
}
