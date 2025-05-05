public class Client {
    public static void main(String[] args) {
        RequestHandler loginHandler = new LoginRequestHandler();
        RequestHandler passwordResetHandler = new PasswordResetRequestHandler();
        RequestHandler registrationHandler = new RegistrationRequestHandler();

        loginHandler.setNextHandler(passwordResetHandler);
        passwordResetHandler.setNextHandler(registrationHandler);

        loginHandler.handleRequest("Login");
        loginHandler.handleRequest("Registration");
        loginHandler.handleRequest("Password Reset");
    }
}


