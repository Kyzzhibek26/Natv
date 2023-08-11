package booster.school.kg.repos;

import booster.school.kg.models.entities.OrderChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderChannelRepository extends JpaRepository<OrderChannel,Long> {

}
