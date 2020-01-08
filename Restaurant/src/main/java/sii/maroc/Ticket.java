package sii.maroc;

public class Ticket {
		
	private int mealNumber;
	private String mealName;
	private int countMeal;
	
	
	
	public int getMealNumber() {
		return mealNumber;
	}

	public void setMealNumber(int mealNumber) {
		this.mealNumber = mealNumber;
	}

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public Ticket(int mealNumber,String mealName){
		this.mealNumber=mealNumber;
		this.mealName=mealName;
	}
	
	public Ticket(){
		
	}
	
	public Ticket and(String string) {
		// TODO Auto-generated method stub
		Integer mealNumber;
		String mealName;
		mealNumber=Integer.parseInt(string.substring(0, 1))+this.mealNumber;
		mealName=string.substring(2, string.length());
		Ticket ticket = new Ticket(mealNumber, mealName);
		return ticket;
	}

}
