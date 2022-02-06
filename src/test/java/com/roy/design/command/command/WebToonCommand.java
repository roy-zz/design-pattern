package com.roy.design.command.command;

public class WebToonCommand extends NaverCommand {
    @Override
    public void execute() {
        naverPage.moveToWebtoonPage();
    }

}
