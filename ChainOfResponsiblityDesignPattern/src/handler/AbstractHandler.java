package handler;

import request.AbstractRequest;

public abstract class AbstractHandler {

    private static int code;

    private AbstractHandler nextHandler;

    public AbstractHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(AbstractRequest request) {
        if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
