package week1.day1;

public class ExecutePhone{

	public static void main(String[] args) {
		
		Mobilephone.setAlarm();
		
		String mobmodel=Mobilephone.getModel();
		System.out.println("the model name is"+ mobmodel);
		
		Mobilephone mb=new Mobilephone();
		int puryear=mb.getPurchasedYear();
		System.out.println("the purchased year is"+ puryear);
		
		// TODO Auto-generated method stub

	}
}
//calling methods from another class
	
  

