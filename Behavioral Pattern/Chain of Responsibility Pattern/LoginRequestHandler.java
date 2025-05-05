public class LoginRequestHandler extends RequestHandler {

    public void handleRequest(String request) {

        if (request.equalsIgnoreCase("Login"))
            System.out.println("Handling Login Request...");
            
        else if (nexRequestHandler != null)
            nexRequestHandler.handleRequest(request);
    }
}

