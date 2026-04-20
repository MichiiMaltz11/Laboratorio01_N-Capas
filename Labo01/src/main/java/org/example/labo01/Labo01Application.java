package org.example.labo01;

import org.example.labo01.services.CatalogService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Labo01Application.class, args);
	}
	@Bean
	public CommandLineRunner run(CatalogService catalogService) {

		return args -> {

			System.out.println("=== INICIANDO CATALOGO ===");
			catalogService.getItems().forEach(p ->
					System.out.println( "[HYRULE-DB]: Nombre: " + p.getName() + " | Categoria: " + p.getCategory() + " | Precio: " + p.getPrice() + " Rupias | Rareza: " + p.getRarity() + " | Efecto: " + p.getEffect() + " | Ubicacion: " + p.getUbication() )
			);
			System.out.println("Mostrando Lista Ordenada por Precio: ");
			catalogService.getItemsByPrice().forEach(p ->
					System.out.println( "[HYRULE-DB]: Nombre: " + p.getName() + " | Categoria: " + p.getCategory() + " | Precio: " + p.getPrice() + " Rupias | Rareza: " + p.getRarity() + " | Efecto: " + p.getEffect() + " | Ubicacion: " + p.getUbication() )
			);
			System.out.println("Mostrando Item mas Caro: ");
			System.out.println("Nombre: " + catalogService.getMostExpensiveItem().getName() +  " | Precio: " + catalogService.getMostExpensiveItem().getPrice() + " Rupias");
			System.out.println("Mostrando Items de Rareza Legendaria: ");
			catalogService.getLegendaryItems().forEach(p -> System.out.println("Nombre: " + p.getName() + " | Rareza: " + p.getRarity())
			);
			System.out.println("Mostrando Lista de Ubicaciones Sin Repetir: ");
			catalogService.getUniqueUbications().forEach(System.out::println);
		};
	}
}
