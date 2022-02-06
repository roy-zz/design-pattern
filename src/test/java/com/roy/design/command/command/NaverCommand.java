package com.roy.design.command.command;

import com.roy.design.command.receiver.NaverPage;

public abstract class NaverCommand {
    protected final NaverPage naverPage;
    public NaverCommand() {
        this.naverPage = new NaverPage();
    }

    public abstract void execute();

}
