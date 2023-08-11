package booster.school.kg.models.entities;

import booster.school.kg.models.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
