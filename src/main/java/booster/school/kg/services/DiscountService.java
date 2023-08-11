package booster.school.kg.services;

import booster.school.kg.models.dtos.DiscountDto;
import booster.school.kg.models.entities.Discount;

public interface DiscountService {
    Discount save( DiscountDto discountDto);

}
