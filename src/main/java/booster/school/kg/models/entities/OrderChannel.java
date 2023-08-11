package booster.school.kg.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "order_channels")

public class OrderChannel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Order order;
    @ManyToOne
    Channel channel;
    @ElementCollection
    @CollectionTable(name = "date_list", joinColumns = @JoinColumn(name = "date_list_id"))
    @Column(name = "date_value")
    List<Date> dateList;
}