package commons;

public class GenderException extends Exception {
    public GenderException(String msg){
        super(msg);
    }
    public GenderException(){
        super("giới tính phải là Nam/Nu hoặc Bede");
    }
}
