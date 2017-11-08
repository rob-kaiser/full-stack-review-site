package reviews.restaurants;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewsPopulator implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {

		// Category (name, image)
		Category asian = new Category("Asian", "/images/asian.jpg");
		categoryRepo.save(asian);

		Category steakhouse = new Category("Steakhouse", "/images/steakhouse.jpg");
		categoryRepo.save(steakhouse);

		Category italian = new Category("Italian", "/images/italian.jpg");
		categoryRepo.save(italian);

		Category mexican = new Category("Mexican", "/images/mexican.jpg");
		categoryRepo.save(mexican);

		Review outback = new Review(steakhouse, "Outback", "/images/OutbackSteakhouse.jpg",
				"Outback has been one of favorites for years, but a sign on the door may change that. My ribeye was was cooked perfectly to the point that the knife wasn't necessary. The salads were large and fresh and the bread was still warm. My problem is a new sign saying no firearms allowed. If this is a store by store decision, I guess I will have to find a new favorite restaurant.",
				"614-755-9926", "6000 E Main St, Columbus, OH 43213");

		reviewRepo.save(outback);

		Review alexanders = new Review(steakhouse, "J. Alexander's", "/images/jalex.jpg",
				"Delicious as usual! Never a disappointment. I read the menu every time and every time I get the same thing because it is so amazing. The drink-a fleur de lis. The appetizer-deviled eggs. The salad-Is a Alex but it's the dressing that makes it a standout, champagne vinaigrette. The main-Filet, it just melts. I take home half my dinner just so I can have dessert-Carrot cake and French press coffee. If you have never been here make a reservation pronto. There is quite a variety to pick from. Sushi sandwiches, even chicken tenders. It is always a nice evening out. My husbands favorite part is the cold bottle of water they bring to the table. He smiles every time they set it down.",
				"(614) 847-1166", "7550 Vantage Dr\r\n" + "Columbus, OH 43235");
		reviewRepo.save(alexanders);

		Review alegrias = new Review(mexican, "Alegria's Seafood", "/images/alegrias.jpg",
				"Alegria's is a hole-in-the-wall restaurant bringing traditional beach hut cuisine to the Midwest! We pride ourselves on offering fresh seafood that is passionately cooked — and we’re certain you’ll be able to taste the difference. Our diverse menu will satisfy the adventurous foodie and the traditional diner alike. Enjoy a house-made cocktail and a seasonally inspired plate for a truly unique Mexican seafood experience!",
				"(614) 793-8190", "2584 Bethel Rd, Columbus, OH 43220");
		reviewRepo.save(alegrias);

		Review guachos = new Review(mexican, "Los Guachos Taqueria", "/images/losguachos.jpg",
				"Los Gauchos is THE best, authentic taco place in Columbus. It also has the best horchata! If you're looking for a place for great tacos or gringas, you need to try this place--you won't be disappointed.",
				"(614) 538-0211", "5221 Godown Rd, Columbus, OH 43235");
		reviewRepo.save(guachos);

		Review bravo = new Review(italian, "Bravo Cucina Italiana", "/images/bravo.jpg",
				"Bring your appetite and your zest for life to our BRAVO Cucina Italiana Italian Restaurant at our Crosswoods location, and you can experience your own little slice of Italy right here in Columbus Ohio. Enjoy traditional classics with a twist in an elegant, family-friendly setting that's perfect for any occasion. It's all right here waiting at BRAVO Cucina Italiana, the best Italian Restaurant in Columbus.",
				"(614) 888-3881", "7470 Vantage Drive\r\n" + "Columbus, OH 43235");
		reviewRepo.save(bravo);

		Review bucci = new Review(italian, "Bucci Di Beppo", "/images/bucaDiBeppoBetterPhoto.jpg",
				"The restaurant decoration is fabulous.. They walk you through the kitchen before seating, I recommend picking one entree for two because the portions are HUGE there is no way that you can have a 3 course meal with these portions. I would definitely go back to this restaurant when I am craving for Italian and very hungry!",
				"614-621-3287", "343 N Front St Columbus, Ohio 43215");
		reviewRepo.save(bucci);

		Review sushi = new Review(asian, "Sushi Time", "/images/SushiTime.jpg",
				"Great quality for the price. I'm not a sushi expert so I really like what they offer me. All you can eat lunch menu has less options than dinner menu but it is cheaper. Lunch is about $13 and dinner about $23. You don't have to do the all you can eat option and just buy at menu price.",
				"614-372-5228", "2653 N High St, Columbus, OH 43202");
		reviewRepo.save(sushi);

		Review poongmei = new Review(asian, "Poong Mei", "/images/poongmei.jpg",
				"Poong Mei does an excellent job balancing Korean flavors with Chinese dishes and bringing out course after course of well-presented dishes.  All of our guests were more than satisfied with the experience.  If you are a fan of Korean-Chinese dishes such as jajangmyeon, kkanpunggi, and palbochae, Poong Mei is the restaurant for you.",
				"(614) 273-9998", "4720 Reed Rd, Upper Arlington, OH 43220");
		reviewRepo.save(poongmei);
	}
}