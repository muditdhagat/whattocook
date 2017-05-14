package platform.core;

public class Recipe {
	
	private long id;
	private String name;
	
	public Recipe() {
		
	}
	
	public Recipe(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
