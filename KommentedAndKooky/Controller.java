package application;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javafx.scene.image.Image;

//The controller class is the user input mechanism of the UI. 
public class Controller {

	static Map<String, Customer> customers = new TreeMap<String, Customer>();
	
	//We have a customer that has to have fields such as first / last name, email and password. 
	public static String createAccount(String user, String first, String last, String email, String password){
		Customer created = new Customer(first, last, email, password);
		
		//If everything is done correctly, a user is created and they can log in. Otherwise it'll show an Error message.
		try{
			customers.put(user, created);
		}catch(Exception e){
			return "ERROR999";
		}
		
		return user;
	}
	
	public static int login(String username, String password){
		try{
			if(customers.get(username).password.equals(password)){
				return 1;
			}else return 0;
		}catch(Exception e){
			return 0;
		}	
	}
	//Shows the user's first name in the welcome banner when they log in.
	public static String setWelcome(String username){
		return customers.get(username).firstName;
	}
	
	//******ARRAY LIST******//
	
	/**Array List that stores the hat names, ****prices**** and images so that they can be pulled later on by the other classes. The price is 
	important because they'll be what the compareTo method uses to sort the hats**/ 
	public static ArrayList<Hat> createHats(){
		ArrayList<Hat> hats = new ArrayList<Hat>();
		
		hats.add(new Hat("Condiment Hat", 10.00, new Image("https://i.pinimg.com/originals/f8/09/bb/f809bb3f111b94acf36cd149a902f182.jpg")));
		hats.add(new Hat("Saturday Morning Hat", 20.00, new Image("https://i.pinimg.com/236x/95/13/8e/95138e60193eb2fd295be768e63eb631--crazy-hat-day-crazy-hats.jpg")));
		hats.add(new Hat("Caliente Hat", 15.00, new Image("https://images-na.ssl-images-amazon.com/images/I/51HmBIawgxL._UX385_.jpg")));
		hats.add(new Hat("Balanced Breakfast Hat", 15.00, new Image("https://i.pinimg.com/736x/a1/d6/6c/a1d66cd962b9618332149ef37889b3f5--silly-hats-funny-hats.jpg")));
		hats.add(new Hat("Aviary Hat", 25.00, new Image("https://s-media-cache-ak0.pinimg.com/originals/33/48/26/334826e669c421a9f7afadd0ec9cf3e7.jpg")));
		hats.add(new Hat("Weenie Hat Jr.", 10.00, new Image("https://i.pinimg.com/736x/da/38/70/da38702ca8f4729cc2e0d29e3810da24--silly-hats-funny-hats.jpg")));
		
		return hats;
	}
}
