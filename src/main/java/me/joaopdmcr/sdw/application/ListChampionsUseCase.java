package me.joaopdmcr.sdw.application;

import me.joaopdmcr.sdw.domain.model.Champion;
import me.joaopdmcr.sdw.domain.ports.ChampionRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionRepository championRepository) {

    public List<Champion> findAll() {
        return championRepository.findAll();
    }
}
