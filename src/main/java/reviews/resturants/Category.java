package reviews.resturants;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	
	@Id @GeneratedValue long id;
//@ Id is a primary key field & @GeneratedValue is automatically created a value
	
	@OneToMany(mappedBy ="category", fetch = FetchType.EAGER) //we had to make a fetchtype...the other option is lazy vs. eager
	
	Map<Long, Review> reviews = new HashMap<Long, Review>();
}
