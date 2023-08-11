package booster.school.kg.services.impl;


import booster.school.kg.mappers.ChannelMapper;
import booster.school.kg.mappers.DiscountMapper;
import booster.school.kg.models.dtos.ChannelDto;
import booster.school.kg.models.dtos.DiscountDto;
import booster.school.kg.models.entities.Channel;
import booster.school.kg.models.entities.Discount;
import booster.school.kg.repos.ChannelRepository;
import booster.school.kg.services.ChannelService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

   private final ChannelRepository channelRepository;

    public ChannelServiceImpl(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    @Override
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(channelRepository.findAll()) ;

    }
    @Override
    public Channel save(ChannelDto channelDto){
        return channelRepository.save(ChannelMapper.INSTANCE.toChannel(channelDto));
    }
    @Override
    public Channel findById(long channelId, List<Channel> channels){
            Channel channel = new Channel();
            for (int i = 0; i < channels.size(); i++) {
                if (channels.get(i).getId() == channelId) {
                    channel = channels.get(i);
                }
            }
            return channel;
        }
}
