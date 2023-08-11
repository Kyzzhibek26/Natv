package booster.school.kg.services.impl;


import booster.school.kg.mappers.OrderChannelMapper;
import booster.school.kg.models.dtos.OrderChannelDto;
import booster.school.kg.models.entities.OrderChannel;
import booster.school.kg.repos.OrderChannelRepository;
import booster.school.kg.services.OrderChannelService;
import org.springframework.stereotype.Service;

@Service
public class OrderChannelServiceImpl implements OrderChannelService {

   private final OrderChannelRepository orderChannelRepository;

    public OrderChannelServiceImpl(OrderChannelRepository orderChannelRepository) {
        this.orderChannelRepository = orderChannelRepository;
    }


    @Override
    public OrderChannel save(OrderChannelDto orderChannelDto) {
        return orderChannelRepository.save(OrderChannelMapper.INSTANCE.toOrderChannel(orderChannelDto));
    }
}
