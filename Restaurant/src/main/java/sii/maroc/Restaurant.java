package sii.maroc;

import java.util.ArrayList;

public class Restaurant {
	private String string;
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	
	private ArrayList<Ingredients> ingredients = null;
	
	public Restaurant(String string, String string2, String string3, String string4) {
		this.string=string;
		this.string1=string2;
		this.string2=string3;
		this.string4=string4;
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String string) {
		
		Integer mealNumber;
		String mealName;
		mealNumber=Integer.parseInt(string.substring(0, 1));
		mealName=string.substring(2, string.length());
		Ticket ticket = new Ticket(mealNumber, mealName);
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal = new Meal();
		int cookingDuration=0;
		if(ticket.getMealName().equals("Tomato Mozzarella Salad")){
		if(ticket.getMealNumber()==1){
			cookingDuration=ticket.getMealNumber()*6;
		}else {
			cookingDuration=6;
			for(int i=1;i<ticket.getMealNumber();i++){
				cookingDuration+=3;
			}
		}
		}
		
		meal.setServedDishes(ticket.getMealNumber());
		meal.setCookingDuration(cookingDuration);
		meal.setTicket(ticket);
		
		return meal;
	}


	
}
