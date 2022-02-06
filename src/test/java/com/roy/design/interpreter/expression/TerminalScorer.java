package com.roy.design.interpreter.expression;

public class TerminalScorer implements Scorer {

    private final String correctAnswer;

    public TerminalScorer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean interpret(String answer) {
        return answer.contains(correctAnswer);
    }

}
