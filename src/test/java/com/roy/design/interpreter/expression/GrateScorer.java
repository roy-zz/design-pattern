package com.roy.design.interpreter.expression;

import java.util.Arrays;

public class GrateScorer implements Scorer {
    private final TerminalScorer[] terminalScorers;

    public GrateScorer(TerminalScorer ... terminalScorers) {
        this.terminalScorers = terminalScorers;
    }

    @Override
    public boolean interpret(String answer) {
        return Arrays.stream(terminalScorers)
                .filter(i -> Boolean.TRUE == i.interpret(answer))
                .count() > terminalScorers.length / 2;
    }

}
