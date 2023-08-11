package booster.school.kg.controllers;

import booster.school.kg.models.dtos.OrderDto;
import booster.school.kg.models.entities.Order;
import booster.school.kg.services.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/save")
    Order save(@RequestBody OrderDto orderDto){
        return  orderService.save(orderDto);
    }
}
