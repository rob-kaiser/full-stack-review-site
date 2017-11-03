package reviews.restaurants;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
​ 
@Component
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
​
}