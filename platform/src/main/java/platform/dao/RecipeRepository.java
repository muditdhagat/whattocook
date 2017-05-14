package platform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import platform.core.Recipe;

@Repository
public class RecipeRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addRecipe(Recipe recipe) {
		jdbcTemplate.update("INSERT INTO recpie(id, name) VALUES (?, ?)", recipe.getId(), recipe.getName());
	}
	
	public List<Recipe> listRecipe() {
		List<Recipe> result = jdbcTemplate.query("SELECT id, name FROM recpie;", (rs, rowNum) -> new Recipe(rs.getInt(1), rs.getString(2)));
		return result;
	}
}
