package booster.school.kg.models.dtos;

import booster.school.kg.models.entities.Channel;
import booster.school.kg.models.entities.Order;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class OrderChannelDto {
    Long id;
    Order order;
    Channel channel;
  //  List<DateList> dateList;
}
