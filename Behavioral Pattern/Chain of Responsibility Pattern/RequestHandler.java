public abstract class RequestHandler {
    RequestHandler nexRequestHandler;

    public void setNextHandler(RequestHandler nexRequestHandler) {
        this.nexRequestHandler = nexRequestHandler;
    }

    abstract public void handleRequest(String request);
}

