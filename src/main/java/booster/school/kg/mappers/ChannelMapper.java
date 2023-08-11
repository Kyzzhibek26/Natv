package booster.school.kg.mappers;


import booster.school.kg.models.dtos.ChannelDto;
import booster.school.kg.models.entities.Channel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ChannelMapper {
    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

    Channel toChannel(ChannelDto channelDto);

    ChannelDto toChannelDto(Channel channel);
}
