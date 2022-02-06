package com.roy.design.interpreter;

import com.roy.design.interpreter.expression.ExcellentScorer;
import com.roy.design.interpreter.expression.GrateScorer;
import com.roy.design.interpreter.expression.Scorer;
import com.roy.design.interpreter.expression.TerminalScorer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void interpreterPatternPractice() {
        TerminalScorer[] scorers = {
                new TerminalScorer("자바"),
                new TerminalScorer("프로그래밍"),
                new TerminalScorer("언어"),
                new TerminalScorer("코틀린"),
                new TerminalScorer("구글")
        };

        Scorer grateScorer = new GrateScorer(scorers);
        Scorer excellentScorer = new ExcellentScorer(scorers);

        String answer1 = "바나나는 과일입니다.";
        String answer2 = "자바와 코틀린은 프로그래밍 언어입니다.";
        String answer3 = "자바와 코틀린은 프로그래밍 언어입니다. 구글에서 코틀린을 좋아합니다.";

        logger.info("제출한 답안 \"{}\"의 Grate 여부는 \"{}\"입니다"
                , answer1, grateScorer.interpret(answer1));
        logger.info("제출한 답안 \"{}\"의 Excellent 여부는 \"{}\"입니다"
                , answer1, excellentScorer.interpret(answer1));
        logger.info("제출한 답안 \"{}\"의 Grate 여부는 \"{}\"입니다"
                , answer2, grateScorer.interpret(answer2));
        logger.info("제출한 답안 \"{}\"의 Excellent 여부는 \"{}\"입니다"
                , answer2, excellentScorer.interpret(answer2));
        logger.info("제출한 답안 \"{}\"의 Grate 여부는 \"{}\"입니다"
                , answer3, grateScorer.interpret(answer3));
        logger.info("제출한 답안 \"{}\"의 Excellent 여부는 \"{}\"입니다"
                , answer3, excellentScorer.interpret(answer3));

    }

}
