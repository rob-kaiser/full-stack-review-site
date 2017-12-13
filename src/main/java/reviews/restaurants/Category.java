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

	@Id
	@GeneratedValue
	@Column(name = "category")

	private long id;
	private String name;
	private String image;
	@OneToMany(mappedBy = "category") 

	@OrderBy("restaurant")
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

	public Set<Review> getReviews() {
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