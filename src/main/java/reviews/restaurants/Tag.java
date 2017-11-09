package reviews.restaurants;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;

	private String location;

	@ManyToMany(mappedBy = "tags")
	private Set<Review> taggedBy;

	public long getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public Set<Review> getTaggedBy() {
		return taggedBy;
	}

	private Tag() {
	}

	public Tag(String location) {
		this.location = location;
	}

}