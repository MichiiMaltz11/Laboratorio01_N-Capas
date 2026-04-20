package org.example.labo01.common;

import org.example.labo01.domain.entitie.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CatalogList {
    private final List<Item> items;
    public CatalogList() {
        this.items = new ArrayList<>();

        this.items.add(Item.builder()
                .id(1L)
                .name("Manzana Silvestre")
                .category("Comida")
                .effect("Corazones")
                .price(5.0)
                .ubication("Bosque de Hyrule")
                .rarity("Común")
                .build());

        this.items.add(Item.builder()
                .id(2L)
                .name("Carne Cruda")
                .category("Comida")
                .effect("Corazones")
                .price(12.0)
                .ubication("Pradera de Hyrule")
                .rarity("Común")
                .build());

        this.items.add(Item.builder()
                .id(3L)
                .name("Pimienta Ardiente")
                .category("Planta")
                .effect("Defensa")
                .price(10.0)
                .ubication("Cordillera de Hebra")
                .rarity("Poco Común")
                .build());

        this.items.add(Item.builder()
                .id(4L)
                .name("Trufa Vital")
                .category("Planta")
                .effect("Corazones")
                .price(45.0)
                .ubication("Bosque de Farone")
                .rarity("Raro")
                .build());

        this.items.add(Item.builder()
                .id(5L)
                .name("Trufa Vital Grande")
                .category("Planta")
                .effect("Corazones")
                .price(90.0)
                .ubication("Bosque de Farone")
                .rarity("Legendario")
                .build());

        this.items.add(Item.builder()
                .id(6L)
                .name("Ámbar")
                .category("Mineral")
                .effect("Defensa")
                .price(30.0)
                .ubication("Montañas de Eldin")
                .rarity("Común")
                .build());

        this.items.add(Item.builder()
                .id(7L)
                .name("Ópalo")
                .category("Mineral")
                .effect("Estamina")
                .price(60.0)
                .ubication("Zora")
                .rarity("Poco Común")
                .build());

        this.items.add(Item.builder()
                .id(8L)
                .name("Rubí")
                .category("Mineral")
                .effect("Ataque")
                .price(110.0)
                .ubication("Volcán de Eldin")
                .rarity("Raro")
                .build());

        this.items.add(Item.builder()
                .id(9L)
                .name("Zafiro")
                .category("Mineral")
                .effect("Defensa")
                .price(100.0)
                .ubication("Cordillera de Hebra")
                .rarity("Raro")
                .build());

        this.items.add(Item.builder()
                .id(10L)
                .name("Diamante")
                .category("Mineral")
                .effect("Ataque")
                .price(500.0)
                .ubication("Montañas de Eldin")
                .rarity("Legendario")
                .build());
    }

    public List<Item> getItems() {
        return items;
    }
}