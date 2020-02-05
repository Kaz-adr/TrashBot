package Listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageEmbedEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;
import java.util.List;

public class PingListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;
        Message message = event.getMessage();
        String content = message.getContentRaw();
        System.out.println(content);
        if (content.equals("!>")){
            MessageChannel channel = event.getChannel();
            channel.sendMessage("I'm here! Hello!").queue();
        }
    }

    @Override
    public void onMessageEmbed(@Nonnull MessageEmbedEvent event) {
        List<MessageEmbed> embedList = event.getMessageEmbeds();
        System.out.println(embedList);
    }
}
