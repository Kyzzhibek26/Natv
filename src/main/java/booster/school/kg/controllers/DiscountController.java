package booster.school.kg.controllers;

import booster.school.kg.models.dtos.DiscountDto;
import booster.school.kg.models.entities.Discount;
import booster.school.kg.services.DiscountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountController {
    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @PostMapping("/save")
    public Discount save(@RequestBody DiscountDto channelDto){
        return  discountService.save(channelDto);
    }

}
