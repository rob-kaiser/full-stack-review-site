package reviews.restaurants;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private CategoryRepository categoryRepo;

	@RequestMapping("/home")
	public String showHomepage() {
		return "home";
	}

	@RequestMapping("/categories")
	public String fetchCategory(Model model) {

		model.addAttribute("categories", categoryRepo.findAll());
		return "categoriesList";
	}

	@RequestMapping("/category")
	public String fetchCategory(@RequestParam("id") long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";
	}

	@RequestMapping("/restaurants")
	public String fetchRestaurants(Model model) {
		model.addAttribute("restaurants", reviewRepo.findAll());
		return "restaurants";
	}

	@RequestMapping("/restaurant")
	public String fetchRestaurant(@RequestParam("id") long id, Model model) {
		Review selectedRestaurant = reviewRepo.findOne(id);
		model.addAttribute("restaurant", selectedRestaurant);
		return "restaurant";
	}
}