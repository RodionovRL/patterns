package mediator.chat;

public class App {
    public static void main(String[] args) {
        ChatRoomMediator chatRoomMediator = new ChatRoom();
        User jesse = new User("Jesse", chatRoomMediator);
        User walter = new User("Walter", chatRoomMediator);

        walter.send("Say my name!");
        jesse.send("BITCH!");
    }
}
