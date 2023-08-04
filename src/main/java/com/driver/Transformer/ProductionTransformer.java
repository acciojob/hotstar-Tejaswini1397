package com.driver.Transformer;

import com.driver.EntryDto.ProductionHouseEntryDto;
import com.driver.model.ProductionHouse;

public class ProductionTransformer {
    public static ProductionHouse convertDtoToEntity(ProductionHouseEntryDto productionHouseEntryDto) {
        ProductionHouse productionHouse=new ProductionHouse();
        productionHouse.setName(productionHouseEntryDto.getName());
        productionHouse.setRatings(0);
        return productionHouse;
    }
}
