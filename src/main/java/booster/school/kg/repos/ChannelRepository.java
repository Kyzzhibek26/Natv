package booster.school.kg.repos;

import booster.school.kg.models.entities.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ChannelRepository extends JpaRepository<Channel,Long> {
    List<Channel> findByid(long id);
}
