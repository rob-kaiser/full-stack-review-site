package reviews.restaurants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private String restaurant;
	@Lob
	private String image;
	@ManyToOne
	private Category reviewCategory;
	@Lob
	private String content;
	private String phoneNumber;
	@Lob
	private String address;

	public Category getCategory() {
		return reviewCategory;
	}

	@JoinColumn(name = "review")

	public long getId() {
		return id;
	}

	private Review() {

	}

	public Review(String restaurant) {
		this.restaurant = restaurant;
	}

	public Review(String restaurant, String image, String content, String phoneNumber, String address,
			String hoursOfOperationA) {
	}

	public Review(Category reviewCategory, String restaurant, String image, String content, String phoneNumber,
			String address) {

		this.restaurant = restaurant;
		this.image = image;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;

	}

	public String getImage() {
		return image;
	}

	public String getContent() {
		return content;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public Category getReviewCategory() {
		return reviewCategory;
	}

	@Override
	public String toString() {
		return String.format("A restaurant with id %s and name '%s'", id, restaurant);
	}

}
