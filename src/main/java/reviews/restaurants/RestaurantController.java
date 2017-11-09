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
	
	@Resource
	private TagRepository tagRepo;

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
	@RequestMapping("/tags")
	public String showTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tag")
	public String fetchTagDetail(@RequestParam("id") Long id, Model model) {
		Tag selectedTag = tagRepo.findOne(id);
		model.addAttribute(selectedTag);
		return "tag";
	}

	@RequestMapping("/createTag")
	public String createTag(@RequestParam(value = "id") Long id, String name) {
		Tag tag = new Tag(name);
		tagRepo.save(tag);
		Review selectedRestaurant = reviewRepo.findOne(id);
		selectedRestaurant.add(tag);
		reviewRepo.save(selectedRestaurant);
		return "redirect:/review?id=" + id;
	}

	@RequestMapping("/deleteTag")
	public String deleteTag(@RequestParam long tagId, @RequestParam long reviewId) {
		Tag toDelete = tagRepo.findOne(tagId);
		for (Review selectedRestaurant : toDelete.getTaggedBy()) {
			selectedRestaurant.remove(toDelete);
			reviewRepo.save(selectedRestaurant);
		}

		tagRepo.delete(toDelete);
		return "redirect:/review?id=" + reviewId;
	}
}