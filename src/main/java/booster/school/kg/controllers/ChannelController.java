package booster.school.kg.controllers;

import booster.school.kg.models.dtos.ChannelDto;
import booster.school.kg.models.entities.Channel;
import booster.school.kg.services.ChannelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {
    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @GetMapping("/list")
    ResponseEntity<?> getList(@RequestParam Long channelId){
        return  channelService.getList();
    }
    @PostMapping("/save")
    Channel save(@RequestBody ChannelDto channelDto){
        return  channelService.save(channelDto);
    }


}

