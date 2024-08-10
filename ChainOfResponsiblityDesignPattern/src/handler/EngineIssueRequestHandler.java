package handler;

import request.AbstractRequest;

public class EngineIssueRequestHandler extends AbstractHandler {

    private final int code = 301;

    public EngineIssueRequestHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getCode() == this.code) {
            System.out.println("EngineIssueRequestHandler is handling request...");
        } else {
            super.handleRequest(request);
        }
    }
}
