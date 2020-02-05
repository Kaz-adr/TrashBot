import Listeners.PingListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String args[]) throws Exception{
        try {
            JDA api = new JDABuilder("Njc0NzA2OTc0Nzc1OTY3NzU0.XjsgTA.HwQGt7mMqx6EqnTjlESkK6ikedg")
                    .setActivity(Activity.playing("!>"))
                    .build();
            api.addEventListener(new PingListener());
            api.awaitReady();
            System.out.println("Bot is up and Running!");
        }
        catch (LoginException e){
            e.printStackTrace();
        }
    }
}
