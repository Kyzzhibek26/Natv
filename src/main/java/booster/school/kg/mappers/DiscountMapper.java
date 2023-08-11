package booster.school.kg.mappers;


import booster.school.kg.models.dtos.DiscountDto;
import booster.school.kg.models.entities.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    Discount toDiscount(DiscountDto discountDto);

    DiscountDto toDiscountDto(Discount discount);
}
