package thi_thuc_hanh.utils;

public class NotFoundProductException extends Exception{
    public NotFoundProductException() {
    }

    public NotFoundProductException(String message) {
        super(message);
    }
}
