package booster.school.kg.services;

import booster.school.kg.models.dtos.OrderDto;
import booster.school.kg.models.entities.Channel;
import booster.school.kg.models.entities.Discount;
import booster.school.kg.models.entities.Order;
import booster.school.kg.models.entities.Price;

public interface OrderService {
    Order save(OrderDto orderDto);
    int countSymbolsWithoutSpaces(String text);
    double getDiscount(long channelId,int countDays,Discount discount, Order order,Price price);
    double getTotalPrice(double pricePerSymbol,int countOfSymbol);
    double getTotalPriceWithDiscount(Price price, Order order, Discount discount);
}
