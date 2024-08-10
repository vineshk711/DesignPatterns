import handler.AbstractHandler;
import handler.BreakOilIssueRequestHandler;
import handler.EngineIssueRequestHandler;
import request.AbstractRequest;
import request.EngineIssueRequest;

public class Main {
    public static void main(String[] args) {
        AbstractHandler engineIssueRequestHandler = new EngineIssueRequestHandler(null);
        AbstractHandler breakOilIssueRequestHandler = new BreakOilIssueRequestHandler(engineIssueRequestHandler);

        AbstractRequest engineIssueRequest = new EngineIssueRequest();
        breakOilIssueRequestHandler.handleRequest(engineIssueRequest);
    }
}