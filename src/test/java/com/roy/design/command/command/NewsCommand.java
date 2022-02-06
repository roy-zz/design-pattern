package com.roy.design.command.command;

public class NewsCommand extends NaverCommand {
    @Override
    public void execute() {
        naverPage.moveToNewsPage();
    }

}
