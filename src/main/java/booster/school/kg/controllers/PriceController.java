package booster.school.kg.controllers;

import booster.school.kg.models.dtos.PriceDto;
import booster.school.kg.models.entities.Price;
import booster.school.kg.services.PriceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class PriceController {
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @PostMapping("/save")
    Price save(@RequestBody PriceDto priceDto){
        return  priceService.save(priceDto);
    }

}
