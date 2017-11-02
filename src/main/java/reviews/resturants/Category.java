package reviews.resturants;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Category {

	
	@Id @GeneratedValue 
//@ Id is a primary key field & @GeneratedValue is automatically created a value
	@Column(name="category")
	private long id;
	@OneToMany(mappedBy ="category") //we had to make a fetchtype...the other option is lazy vs. eager
	
	private List<Review> reviews;
}
