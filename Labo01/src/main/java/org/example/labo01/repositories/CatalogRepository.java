package org.example.labo01.repositories;

import lombok.RequiredArgsConstructor;
import org.example.labo01.common.CatalogList;
import org.example.labo01.domain.entitie.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CatalogRepository {

    private final CatalogList catalogList;

    public List<Item> getCatalogItems() {
        return catalogList.getItems();
    }

}
