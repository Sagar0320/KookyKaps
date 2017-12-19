package application; 

//This class's information is used in the other classes so that users can set up a first name, last name, email and a password.
public class Customer {

	String firstName;
	String lastName;
	String email;
	String password;
	
	public Customer(String infirst, String inlast, String inemail, String inpass){
		firstName = infirst;
		lastName = inlast;
		email = inemail;
		password = inpass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
