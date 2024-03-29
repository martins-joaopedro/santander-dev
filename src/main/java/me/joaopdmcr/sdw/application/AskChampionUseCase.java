package me.joaopdmcr.sdw.application;

import me.joaopdmcr.sdw.domain.exception.ChampionNotFoundException;
import me.joaopdmcr.sdw.domain.model.Champion;
import me.joaopdmcr.sdw.domain.ports.ChampionRepository;

public record AskChampionUseCase(ChampionRepository repository) {

    public String askChampion(Long championId, String question) {

        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        //TODO: evoluir a lógica

        return champion.generateContextByQuestion(question);
    }
}
