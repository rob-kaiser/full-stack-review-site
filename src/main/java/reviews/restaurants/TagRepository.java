package reviews.restaurants;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByLocation(String location);

	Tag findByLocationContains(String substring);
}