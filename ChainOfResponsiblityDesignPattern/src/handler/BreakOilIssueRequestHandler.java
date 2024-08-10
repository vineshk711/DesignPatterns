package handler;

import request.AbstractRequest;

public class BreakOilIssueRequestHandler extends AbstractHandler {

    private static int code = 302;

    public BreakOilIssueRequestHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getCode() == code) {
            System.out.println("BreakOilIssueRequestHandler is handling request...");
        } else  {
            super.handleRequest(request);
        }
    }
}
