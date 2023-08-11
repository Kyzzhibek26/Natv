package booster.school.kg.services;

import booster.school.kg.models.dtos.ChannelDto;
import booster.school.kg.models.entities.Channel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ChannelService {
    ResponseEntity<?> getList();
    Channel save(ChannelDto channelDto);
    Channel findById(long channelId, List<Channel> channels);
}
