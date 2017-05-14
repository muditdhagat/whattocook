package platform.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import platform.core.Recipe;
import platform.dao.RecipeRepository;

@RestController
public class RecipeController {
	
	@Autowired
	private RecipeRepository repository;
	
	@RequestMapping(value = "/recipe", method=RequestMethod.GET)
	public String statusCheck() {
		return "Recipe Service is Up and Running";
	}
	
	@RequestMapping(value = "/recipe/add", method = RequestMethod.POST)
	public void addRecipe(@RequestBody Recipe recipe) {
		repository.addRecipe(recipe);
	}
	
	@RequestMapping(value = "/recipe/all", method = RequestMethod.GET)
	public List<Recipe> listRecipe() {
		return repository.listRecipe();
	}
	
	
	
	

}
