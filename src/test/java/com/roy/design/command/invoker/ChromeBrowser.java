package com.roy.design.command.invoker;

import com.roy.design.command.command.NaverCommand;

public class ChromeBrowser {
    private NaverCommand naverCommand;

    public void setNaverCommand(NaverCommand naverCommand) {
        this.naverCommand = naverCommand;
    }

    public void click() {
        naverCommand.execute();
    }

}
