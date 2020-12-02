package case_study.bai_tap_3;

public class NotFoundProductException extends Exception {
    public NotFoundProductException(String msg){
        super(msg);
    }

    public NotFoundProductException(){
        super("San pham khong ton tai.");
    }
}
