package com.roy.design.iterator.video;

import java.util.Iterator;
import java.util.Objects;

public class SquidGameSeason implements Iterator<SquidGame> {
    private final SquidGame[] squidGames;
    private int episode = 0;

    public SquidGameSeason(SquidGame[] squidGames) {
        this.squidGames = squidGames;
    }

    @Override
    public boolean hasNext() {
        return episode < squidGames.length && !Objects.isNull(squidGames[episode]);
    }

    @Override
    public SquidGame next() {
        SquidGame currentSquidGame = squidGames[episode];
        episode++;
        return currentSquidGame;
    }

}
