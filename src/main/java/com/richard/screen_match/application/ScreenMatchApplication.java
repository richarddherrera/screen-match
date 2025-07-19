package com.richard.screen_match.application;

import com.richard.screen_match.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner { // Implementamos esta interface para poder usar a linha de comando

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	// Como implementamos aquela interace precisamos implementar este metodo para ele agir como um metodo main
	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
	}
}
