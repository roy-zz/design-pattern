package com.roy.design.command;

import com.roy.design.command.command.*;
import com.roy.design.command.invoker.ChromeBrowser;
import org.junit.jupiter.api.Test;

public class Client {

    @Test
    void commandPatternPractice() {
        ChromeBrowser chromeBrowser = new ChromeBrowser();

        NaverCommand mailCommand = new MailCommand();
        NaverCommand newsCommand = new NewsCommand();
        NaverCommand shoppingCommand = new ShoppingCommand();
        NaverCommand webToonCommand = new WebToonCommand();

        chromeBrowser.setNaverCommand(mailCommand);
        chromeBrowser.click();
        chromeBrowser.setNaverCommand(newsCommand);
        chromeBrowser.click();
        chromeBrowser.setNaverCommand(shoppingCommand);
        chromeBrowser.click();
        chromeBrowser.setNaverCommand(webToonCommand);
        chromeBrowser.click();
    }

}
