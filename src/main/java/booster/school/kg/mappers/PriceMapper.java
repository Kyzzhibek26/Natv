package booster.school.kg.mappers;


import booster.school.kg.models.dtos.PriceDto;
import booster.school.kg.models.entities.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    Price toPrice(PriceDto priceDto);

    PriceDto toPriceDto(Price price);
}
