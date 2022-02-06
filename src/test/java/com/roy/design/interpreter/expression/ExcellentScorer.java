package com.roy.design.interpreter.expression;

import java.util.Arrays;

public class ExcellentScorer implements Scorer {
    private final TerminalScorer[] terminalScorers;

    public ExcellentScorer(TerminalScorer ... terminalScorers) {
        this.terminalScorers = terminalScorers;
    }

    @Override
    public boolean interpret(String answer) {
        return Arrays.stream(terminalScorers)
                .allMatch(i -> Boolean.TRUE == i.interpret(answer));
    }

}
