package reviews.restaurants;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ReviewRepository extends CrudRepository<Review, Long>{
		
}