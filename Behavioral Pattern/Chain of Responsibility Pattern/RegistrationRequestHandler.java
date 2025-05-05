public class RegistrationRequestHandler extends RequestHandler {
    public void handleRequest(String request) {
        
        if (request.equalsIgnoreCase("Registration"))
            System.out.println("Handling Registraion Request...");

        else if (nexRequestHandler == null)
            nexRequestHandler.handleRequest(request);
    }
}
