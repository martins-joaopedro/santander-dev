package me.joaopdmcr.sdw.domain.exception;

public class ChampionNotFoundException extends RuntimeException {

    public ChampionNotFoundException(Long championId) {
        super("Champion with id %d was not found!".formatted(championId));
    }
}
