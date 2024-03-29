package me.joaopdmcr.sdw;

import me.joaopdmcr.sdw.application.AskChampionUseCase;
import me.joaopdmcr.sdw.application.ListChampionsUseCase;
import me.joaopdmcr.sdw.domain.ports.ChampionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SantanderDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevApplication.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionRepository repository) {
		return new ListChampionsUseCase(repository);
	}

	@Bean
	public AskChampionUseCase provideAskChampionsUseCase(ChampionRepository repository) {
		return new AskChampionUseCase(repository);
	}
}
