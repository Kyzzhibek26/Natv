package booster.school.kg.models.dtos;

import booster.school.kg.models.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDto {
    Long id;
    Date createdDate;
    String clientName;
    String email;
    String phoneNumber;
    String text;
    Status status;
    double totalPrice;
    double priceWithDiscount;

}
