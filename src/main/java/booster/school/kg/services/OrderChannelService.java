package booster.school.kg.services;

import booster.school.kg.models.dtos.OrderChannelDto;
import booster.school.kg.models.entities.OrderChannel;

public interface OrderChannelService {
    OrderChannel save(OrderChannelDto orderChannelDto);
}
