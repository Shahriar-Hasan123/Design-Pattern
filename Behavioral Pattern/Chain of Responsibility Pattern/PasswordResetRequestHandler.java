public class PasswordResetRequestHandler extends RequestHandler {

    public void handleRequest(String request) {

        if (request.equalsIgnoreCase("Password Reset"))
            System.out.println("Handling Passowrd Reset Request...");

        else if (nexRequestHandler != null)
            nexRequestHandler.handleRequest(request);
    }
}
