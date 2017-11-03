package reviews.restaurants;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity

public class Category {

	
	@Id @GeneratedValue 
//@ Id is a primary key field & @GeneratedValue is automatically created a value
	@Column(name="category")
	
	private long id;
	private String name;
	private String image;
	@OneToMany(mappedBy ="category") //we had to make a fetchtype...the other option is lazy vs. eager
	
	
	@OrderBy("name")
	private Set<Review> reviews;
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public String getImage() {
		return image;
	}
	

	// JPA needs no argument constructor

	public Set<Review> getReview() {
		return reviews;
	}
	
	@SuppressWarnings("unused")
	private Category() {
	}

	public Category(String name, String image) {
		this.name = name;
		this.image = image;
	}
	@Override
	public String toString() {
		return name;
	}
}
