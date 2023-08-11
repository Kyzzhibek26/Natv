package booster.school.kg.controllers;

import booster.school.kg.models.dtos.OrderChannelDto;
import booster.school.kg.models.entities.OrderChannel;
import booster.school.kg.services.OrderChannelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderChannel")
public class OrderChannelController {
    private final OrderChannelService orderChannelService;

    public OrderChannelController(OrderChannelService orderChannelService) {
        this.orderChannelService = orderChannelService;
    }


    @PostMapping("/save")
    OrderChannel save(@RequestBody OrderChannelDto orderchannelDto){
        return  orderChannelService.save(orderchannelDto);
    }

}
