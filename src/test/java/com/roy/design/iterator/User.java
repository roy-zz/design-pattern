package com.roy.design.iterator;

import com.roy.design.iterator.streaming.Netflix;
import com.roy.design.iterator.streaming.StreamingService;
import com.roy.design.iterator.streaming.Tving;
import com.roy.design.iterator.streaming.Wavve;
import com.roy.design.iterator.video.SquidGame;
import com.roy.design.iterator.video.SquidGameSeason;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void iteratorPatternPractice() {
        StreamingService netflix = new Netflix();
        SquidGameSeason squidGameSeasonFromNetflix = (SquidGameSeason) netflix.createSeason();
        while (squidGameSeasonFromNetflix.hasNext()) {
            SquidGame squidGame = squidGameSeasonFromNetflix.next();
            logger.info("[Netflix] 회차: {}, 제목: {}", squidGame.getEpisode(), squidGame.getName());
        }

        StreamingService tving = new Tving();
        SquidGameSeason squidGameSeasonFromTving = (SquidGameSeason) tving.createSeason();
        while (squidGameSeasonFromTving.hasNext()) {
            SquidGame squidGame = squidGameSeasonFromTving.next();
            logger.info("[Tving] 회차: {}, 제목: {}", squidGame.getEpisode(), squidGame.getName());
        }

        StreamingService wavve = new Wavve();
        SquidGameSeason squidGameSeasonFromWavve = (SquidGameSeason) wavve.createSeason();
        while (squidGameSeasonFromWavve.hasNext()) {
            SquidGame squidGame = squidGameSeasonFromWavve.next();
            logger.info("[Wavve] 회차: {}, 제목: {}", squidGame.getEpisode(), squidGame.getName());
        }
    }

}
