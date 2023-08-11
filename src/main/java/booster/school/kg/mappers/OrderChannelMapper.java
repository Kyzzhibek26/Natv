package booster.school.kg.mappers;


import booster.school.kg.models.dtos.OrderChannelDto;
import booster.school.kg.models.entities.OrderChannel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderChannelMapper {
    OrderChannelMapper INSTANCE = Mappers.getMapper(OrderChannelMapper.class);

    OrderChannel toOrderChannel(OrderChannelDto orderChannelDto);

    OrderChannelDto toOrderChannelDto(OrderChannel orderChannel);
}
