package me.joaopdmcr.sdw.adapters.in;

import me.joaopdmcr.sdw.application.ListChampionsUseCase;
import me.joaopdmcr.sdw.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }

}
