package 异常.自定义异常;

public class opeartion extends RuntimeException{
    public opeartion() {
    }

    public opeartion(String message) {
        super(message);
    }
}
