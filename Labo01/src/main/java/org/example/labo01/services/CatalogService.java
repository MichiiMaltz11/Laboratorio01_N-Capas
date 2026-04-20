package org.example.labo01.services;

import lombok.RequiredArgsConstructor;
import org.example.labo01.domain.entitie.Item;
import org.example.labo01.repositories.CatalogRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogService {

    private final CatalogRepository catalogRepository;

    public List<Item> getItems() {
        return catalogRepository.getCatalogItems();
    }

    public List<Item> getItemsByPrice() {
        return catalogRepository.getCatalogItems()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getPrice(), e1.getPrice())) // De mayor a menor
                .toList();
    }

    public Item getMostExpensiveItem() {
        return catalogRepository.getCatalogItems()
                .stream()
                .max(Comparator.comparingDouble(Item::getPrice))
                .orElse(null);
    }

    public List<Item> getLegendaryItems() {
        return catalogRepository.getCatalogItems()
                .stream()
                .filter(item -> "Legendario".equalsIgnoreCase(item.getRarity()))
                .toList();
    }

    public List<String> getUniqueUbications() {
        return catalogRepository.getCatalogItems()
                .stream()
                .map(Item::getUbication)
                .distinct()
                .toList();
    }
}