package booster.school.kg.models.dtos;

import booster.school.kg.models.entities.Channel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountDto {
    Long id;
    Channel chanel ;
    double discount;
    int countDays;
    @CreationTimestamp
    Date createdDate;
    Date endDate;

}
