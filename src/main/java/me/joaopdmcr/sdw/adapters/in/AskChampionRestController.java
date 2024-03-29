package me.joaopdmcr.sdw.adapters.in;

import me.joaopdmcr.sdw.application.AskChampionUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampion(@PathVariable Long championId, @RequestBody AskChampionRequest request) {

        String answer = useCase.askChampion(championId, request.question());
        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question) { }
    public record AskChampionResponse(String answer) { }
}
