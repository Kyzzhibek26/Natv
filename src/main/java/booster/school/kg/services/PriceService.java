package booster.school.kg.services;

import booster.school.kg.models.dtos.PriceDto;
import booster.school.kg.models.entities.Price;

public interface PriceService {
    Price save(PriceDto priceDto);
}
