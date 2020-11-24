package commons;

public class NameException extends Exception {
    public NameException(String msg) {
        super(msg);
    }

    public NameException() {
        super("Tên khách hàng phải in hoa ký tự đầu tiên trong mỗi từ !");
    }
}
