package com.roy.design.iterator.streaming;

import com.roy.design.iterator.video.SquidGame;
import com.roy.design.iterator.video.SquidGameSeason;

import java.util.Iterator;
import java.util.Set;

public class Tving implements StreamingService {
    private Set<SquidGame> squidGames = Set.of(
            new SquidGame(1, "무궁화 꽃이 피던 날"),
            new SquidGame(2, "지옥"),
            new SquidGame(3, "우산을 쓴 남자"),
            new SquidGame(4, "쫄려도 편먹기"),
            new SquidGame(5, "평등한 세상"),
            new SquidGame(6, "깐부"),
            new SquidGame(7, "V.I.P.S"),
            new SquidGame(8, "프론트맨"),
            new SquidGame(9, "운수 좋은 날")
    );

    @Override
    public Iterator<?> createSeason() {
        return new SquidGameSeason(squidGames.toArray(new SquidGame[0]));
    }

}
