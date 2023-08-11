package booster.school.kg.models.dtos;

import booster.school.kg.models.entities.Channel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelDto {
    Long id;
    String name;
    String imageUrl;
    @CreationTimestamp
    Date createdDate;
    Date endDate;
}
