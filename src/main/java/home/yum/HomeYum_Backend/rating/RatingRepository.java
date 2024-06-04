package home.yum.HomeYum_Backend.rating;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    Page<Rating> findAllByActiveTrue(Pageable pagination);
}
