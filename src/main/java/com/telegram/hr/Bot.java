package com.telegram.hr;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

//    public Bot(DefaultBotOptions options) {
//        super(options);
//    }

    public void onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        if (update.getMessage().getText().equals("Привет")) {
            sendMessage.setText("Привет дружище!");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return "@HR_UtilsBot";
    }

    public String getBotToken() {
        return "909281295:AAGGHx4C-PS-UvQWHzBrT0B0VHSAov___K";
    }
}
