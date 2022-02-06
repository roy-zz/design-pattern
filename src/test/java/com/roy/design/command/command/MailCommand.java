package com.roy.design.command.command;

public class MailCommand extends NaverCommand {
    @Override
    public void execute() {
        naverPage.moveToMailCommand();
    }

}
