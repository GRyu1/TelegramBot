package tutorial;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

public class Bots extends TelegramLongPollingBot {

    private boolean screaming = false;

    @Override
    public String getBotUsername() {
        return "Hwjdakljl_bot";
    }

    @Override
    public String getBotToken() {
        return "7517197184:AAFvEMUgQUzKoU1QHuNq0YFe0uKCK1a0WFc";
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        User user = message.getFrom();
        String contents = message.getText();

        System.out.println(user.getFirstName() + " : " + (contents.startsWith("/scream") ? contents.replace("/scream ","").toUpperCase() : contents));
    }

}
