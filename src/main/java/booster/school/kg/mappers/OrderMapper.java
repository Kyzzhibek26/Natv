package booster.school.kg.mappers;


import booster.school.kg.models.dtos.OrderDto;
import booster.school.kg.models.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order toOrder(OrderDto orderDto);

    OrderDto toOrderDto(Order order);
}
