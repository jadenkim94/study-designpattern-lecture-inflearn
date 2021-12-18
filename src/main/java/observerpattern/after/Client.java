package observerpattern.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("jaden");
        User user2 = new User("summerBell");

        chatServer.register("오징어 게임", user1);
        chatServer.register("오징어 게임", user2);

        chatServer.register("디자인 패턴", user1);

        chatServer.sendMessage(user1, "오징어 게임", "Hello world");
    }
}
