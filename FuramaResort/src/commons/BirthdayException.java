package commons;

public class BirthdayException extends Exception{
    public BirthdayException(String msg){
        super(msg);
    }
    public BirthdayException(){
        super("năm sinh phải > 1900 và nhỏ hơn hiện tại 18 năm , đúng định dạng dd/MM/yyyy");
    }
}
