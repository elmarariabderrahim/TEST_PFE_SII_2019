package sii.maroc;

public class Ingredients {
	
	private String nameIngredient;
	private int NumberIngredient;
	
	
	public String getNameIngredient() {
		return nameIngredient;
	}
	public void setNameIngredient(String nameIngredient) {
		this.nameIngredient = nameIngredient;
	}
	public int getNumberIngredient() {
		return NumberIngredient;
	}
	
	public Ingredients(String nameIngredient, int numberIngredient) {
		
		this.nameIngredient = nameIngredient;
		this.NumberIngredient = numberIngredient;
	}
	
	
	
}
