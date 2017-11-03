package reviews.restaurants;

import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}