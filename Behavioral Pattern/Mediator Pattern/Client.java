public class Client {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User sara = new User("Sara");
        robert.sendMsg("Hi Sara!");
        sara.sendMsg("Hello Robert!");
    }
}
