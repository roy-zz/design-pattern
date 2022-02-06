package com.roy.design.command.command;

public class ShoppingCommand extends NaverCommand {
    @Override
    public void execute() {
        naverPage.moveToShoppingCommand();
    }

}
