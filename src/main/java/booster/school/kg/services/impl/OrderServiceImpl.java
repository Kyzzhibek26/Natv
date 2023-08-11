package booster.school.kg.services.impl;


import booster.school.kg.mappers.OrderMapper;
import booster.school.kg.models.dtos.OrderDto;
import booster.school.kg.models.entities.Channel;
import booster.school.kg.models.entities.Discount;
import booster.school.kg.models.entities.Order;
import booster.school.kg.models.entities.Price;
import booster.school.kg.repos.OrderRepository;
import booster.school.kg.services.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(OrderDto orderDto) {
        return orderRepository.save(OrderMapper.INSTANCE.toOrder(orderDto));
    }


    //Посчитать количество символов без учета пробелов
    @Override
    public int countSymbolsWithoutSpaces(String text) {
        return text.replaceAll(" ", "").length();
    }

    //Получить стоимость одного символа и скидку по количеству дней выбранного канала
    @Override
    public double getDiscount(long channelId,int countDays,Discount discount, Order order,Price price) {
        if(countDays >=3 && countDays <= 6){
        discount.setDiscount(getTotalPrice(price.getPricePerSymbol(),countSymbolsWithoutSpaces(order.getText()))*0.05);
        } else if(countDays >=7 && countDays <= 9){
            discount.setDiscount(getTotalPrice(price.getPricePerSymbol(),countSymbolsWithoutSpaces(order.getText()))*0.10);
        } else {
            discount.setDiscount(getTotalPrice(price.getPricePerSymbol(),countSymbolsWithoutSpaces(order.getText()))*0.15);
        }
        return discount.getDiscount();
    }
    //Посчитать общую сумму за текст
    @Override
    public double getTotalPrice(double pricePerSymbol,int countOfSymbol) {
        return pricePerSymbol*countOfSymbol;
    }
    //Если скидка есть, то применить ее к общей сумме
    @Override
    public double getTotalPriceWithDiscount(Price price,Order order,Discount discount){
        return getTotalPrice(price.getPricePerSymbol(),countSymbolsWithoutSpaces(order.getText())) - discount.getDiscount();
    }


}
