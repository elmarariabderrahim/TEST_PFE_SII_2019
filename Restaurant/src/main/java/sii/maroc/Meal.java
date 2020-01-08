package sii.maroc;

public class Meal {
	
	private String mealName;
	private int servedDishes;
	private int cookingDuration;
	private Ticket ticket;
	
	
	public Meal(int servedDishes, int cookingDuration ){
		this.cookingDuration=cookingDuration;
		this.servedDishes=servedDishes;
	}
	public Meal(){
		
	}
	
	
	
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public int getServedDishes() {
		return servedDishes;
	}
	public void setServedDishes(int servedDishes) {
		this.servedDishes = servedDishes;
	}
	public int getCookingDuration() {
		return cookingDuration;
	}
	public void setCookingDuration(int cookingDuration) {
		this.cookingDuration = cookingDuration;
	}
	public int servedDishes() {
		// TODO Auto-generated method stub
		
		
		return ticket.getMealNumber();
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		return cookingDuration;
	}

}
