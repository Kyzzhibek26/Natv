package booster.school.kg.services.impl;


import booster.school.kg.mappers.DiscountMapper;
import booster.school.kg.models.dtos.DiscountDto;
import booster.school.kg.models.entities.Discount;
import booster.school.kg.repos.DiscountRepository;
import booster.school.kg.services.DiscountService;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {

   private final DiscountRepository discountRepository;

    public DiscountServiceImpl(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    @Override
    public Discount save(DiscountDto discountDto) {
        discountDto.getChanel().getId();
        return discountRepository.save(DiscountMapper.INSTANCE.toDiscount(discountDto));
    }

}
