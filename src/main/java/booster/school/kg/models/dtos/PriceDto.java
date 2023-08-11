package booster.school.kg.models.dtos;

import booster.school.kg.models.entities.Channel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto {
    Long id;
    Channel channel;
    double pricePerSymbol;
    Date createdDate;
    Date endDate;

}
