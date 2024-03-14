package mediator.chat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessage(User user, String message)
    {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss.SSS"));
        String sender = user.getName();

        System.out.printf("%s [%s] %s\n",time, sender, message);
    }
}
