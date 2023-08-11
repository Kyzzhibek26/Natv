package booster.school.kg.services.impl;


import booster.school.kg.mappers.PriceMapper;
import booster.school.kg.models.dtos.PriceDto;
import booster.school.kg.models.entities.Price;
import booster.school.kg.repos.PriceRepository;
import booster.school.kg.services.PriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {

   private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }


    @Override
    public Price save(PriceDto priceDto) {
        return priceRepository.save(PriceMapper.INSTANCE.toPrice(priceDto));
    }
}
