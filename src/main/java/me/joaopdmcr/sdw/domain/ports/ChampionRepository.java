package me.joaopdmcr.sdw.domain.ports;

import me.joaopdmcr.sdw.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionRepository {

    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}
