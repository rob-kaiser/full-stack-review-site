package reviews.resturants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

	private String restaurant;
	private String image;
	private String reviewCategory;
	private String content;
	private String phoneNumber;
	private String address;
	private String hoursOfOperationA;
	private String hoursOfOperationB;
	private String hoursOfOperationC;
	@Id @GeneratedValue long id;

	public long getId() {
		return id;
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

	public String getHoursOfOperationA() {
		return hoursOfOperationA;
	}

	public String getHoursOfOperationB() {
		return hoursOfOperationB;
	}

	public String getHoursOfOperationC() {
		return hoursOfOperationC;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public Review(long id, String restaurant, String image, String reviewCategory, String content, String phoneNumber,
			String address, String hoursOfOperationA, String hoursOfOperationB, String hoursOfOperationC) {
		this.id = id;
		this.restaurant = restaurant;
		this.image = image;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.hoursOfOperationA = hoursOfOperationA;
		this.hoursOfOperationB = hoursOfOperationB;
		this.hoursOfOperationC = hoursOfOperationC;
	}

}
