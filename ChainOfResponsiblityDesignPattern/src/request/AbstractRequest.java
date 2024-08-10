package request;

public abstract class AbstractRequest {
    private final int code;

    public AbstractRequest(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
