package application;

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/***********This .java file is for all the user interaction pages such as the main page, the registration page and the search hats page.
   All pages are split up below!***********/

public class UserInterface extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		GridPane login = new GridPane();
		login.setId("loginPane");
		login.setAlignment(Pos.CENTER);
		login.setHgap(10);
		login.setVgap(10);
		login.setPadding(new Insets(25,25,25,25));
		
		
		VBox loginMaster = new VBox();
		loginMaster.setAlignment(Pos.CENTER);
		loginMaster.setSpacing(50);
		HBox loginBox = new HBox();
		loginBox.setSpacing(10);
		
		//This is the code for the login screen. Shows the title / title font, size and color as well as alignment. 
		Text loginTitle = new Text("KoOkY kApS");
		loginTitle.setFont(Font.font("Allura", FontWeight.NORMAL, 90));
		loginTitle.setFill(Color.GREENYELLOW);
		loginTitle.setStroke(Color.BLACK);
		loginTitle.setTextAlignment(TextAlignment.CENTER);
		login.add(loginTitle, 2, 0);
		
		//Button for browsing the selection.
		Button browse = new Button("Browse our selection!");
		
		//Here, the user can put in their user name if they have one.
		TextField usnInput = new TextField();
		usnInput.setPromptText("Username");
		usnInput.setMaxWidth(150);
		
		//Here, the user can put in their password if they have one.
		PasswordField pswInput = new PasswordField();
		pswInput.setPromptText("Password");
		pswInput.setMaxWidth(150);
		
		//Login / Sign Up buttons
		Button submitLogin = new Button("Login");
		Button signUp = new Button("Sign Up");
		
		/**This is for when if the user doesn't have any credentials and they sign up for Kooky Kaps, it redirects them back to the main page after they've signed up
		and says that registration is complete and they can use that information to sign in**/
		
		Text registeredPrompt = new Text("Registration complete. Log in now!");
		registeredPrompt.setFill(Color.WHITE);
		registeredPrompt.setStroke(Color.GREENYELLOW);
		registeredPrompt.setFont(Font.font("Allura", FontWeight.NORMAL, 20));
		registeredPrompt.setVisible(false);
		
		
		loginBox.getChildren().addAll(usnInput, pswInput, submitLogin);
		loginMaster.getChildren().addAll(browse, registeredPrompt, loginBox, signUp);
		login.add(loginMaster, 2, 2);
				
		Scene loginPage = new Scene(login, 800, 600);
		loginPage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
		primaryStage.setScene(loginPage);
		primaryStage.setTitle("Kooky Kaps");
		primaryStage.show();
		
		//****************************REGISTER PAGE****************************//
		
		GridPane register = new GridPane();
		register.setId("registerPane");
		register.setAlignment(Pos.TOP_CENTER);
		
		register.setHgap(10);
		register.setVgap(20);
		register.setPadding(new Insets(0,25,25,25));
		
		VBox registerBox = new VBox();
		registerBox.setAlignment(Pos.CENTER);
		registerBox.setSpacing(25);

		HBox usernameBox = new HBox();
		usernameBox.setSpacing(10);
		usernameBox.setAlignment(Pos.CENTER);
		
		HBox firstNameBox = new HBox();
		firstNameBox.setSpacing(10);
		firstNameBox.setAlignment(Pos.CENTER);
		
		HBox lastNameBox = new HBox();
		lastNameBox.setSpacing(5);
		lastNameBox.setAlignment(Pos.CENTER);
		
		HBox emailBox = new HBox();
		emailBox.setSpacing(1);
		emailBox.setAlignment(Pos.CENTER);
		
		HBox passwordBox = new HBox();
		passwordBox.setSpacing(5);
		passwordBox.setAlignment(Pos.CENTER);
		
		HBox buttonBox = new HBox();
		buttonBox.setSpacing(10);
		buttonBox.setAlignment(Pos.CENTER);
		
		
		//The main header text for the registration page. It shows the title, font, size, color and alignment of the text.
		Text registerTitle = new Text("Register & Get Kooky!");
		registerTitle.setFont(Font.font("Allura", FontWeight.NORMAL, 60));
		registerTitle.setFill(Color.GREENYELLOW);
		registerTitle.setStroke(Color.BLACK);
		registerTitle.setTextAlignment(TextAlignment.CENTER);
		register.add(registerTitle, 2, 0);
		
		//These buttons either cancel or confirm/submit a new account 
		Button cancelBT = new Button("Cancel");
		Button submitBT = new Button("Submit");
		
		//The labels are for fields the user HAS to fill out on the registration page. Ex: First name, Last Name, User name, etc.
		Text firstNameL = new Text("First Name: ");
		firstNameL.setFill(Color.WHITE);
		firstNameL.setStroke(Color.BLACK);
		firstNameL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		Text usernameL = new Text("Username: ");
		usernameL.setFill(Color.WHITE);
		usernameL.setStroke(Color.BLACK);
		usernameL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		Text lastNameL= new Text("Last Name: ");
		lastNameL.setFill(Color.WHITE);
		lastNameL.setStroke(Color.BLACK);
		lastNameL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		
		Text emailL = new Text("Email Address: ");
		emailL.setFill(Color.WHITE);
		emailL.setStroke(Color.BLACK);
		emailL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		Text passwordL = new Text("Password: ");
		passwordL.setFill(Color.WHITE);
		passwordL.setStroke(Color.BLACK);
		passwordL.setFont(Font.font("Allura", FontWeight.BOLD, 25));
		
		//The user fills out information for those text fields here.
		TextField firstNameTF = new TextField();
		firstNameTF.setMaxWidth(200);
		
		TextField usernameTF = new TextField();
		usernameTF.setMaxWidth(200);
		
		TextField lastNameTF = new TextField();
		lastNameTF.setMaxWidth(200);
		
		TextField emailTF = new TextField();
		emailTF.setMaxWidth(200);
		
		PasswordField passwordTF = new PasswordField();
		passwordTF.setMaxWidth(200);
		
		usernameBox.getChildren().addAll(usernameL, usernameTF);
		firstNameBox.getChildren().addAll(firstNameL, firstNameTF);
		lastNameBox.getChildren().addAll(lastNameL, lastNameTF);
		emailBox.getChildren().addAll(emailL, emailTF);
		passwordBox.getChildren().addAll(passwordL, passwordTF);
		buttonBox.getChildren().addAll(cancelBT, submitBT);
		
		registerBox.getChildren().addAll(usernameBox, firstNameBox, lastNameBox, emailBox, passwordBox, buttonBox);
		
		register.add(registerBox, 2, 2);
		
		
		
		Scene registerPage = new Scene(register, 800, 600);
		registerPage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
		
		//****************************SEARCH PAGE****************************//
		
		//The main header text for the search page. It shows the title of the search page, font, size, color and alignment of that text.
		Text title = new Text("Kooky Kaps");
		title.setFont(Font.font("Arial Black", FontWeight.BLACK, 25));
		title.setFill(Color.GREENYELLOW);
		title.setStroke(Color.BLACK);
		
		//The second header here, also showing the font, size, color. Not showing the alignment though.
		Text welcome = new Text("Welcome Guest!");
		welcome.setFont(Font.font("Arial Black", FontWeight.BLACK, 15));
		welcome.setFill(Color.WHITE);
		
		//This button goes to the main screen again where the user has the option to log back in. 
		Button logout = new Button("Logout");
		
		//Array List that stores the hats! 
		ArrayList<Hat> hats = Controller.createHats();

		//Image
		ImageView image = new ImageView (hats.get(0).image);
		image.setFitHeight(163);
		image.setFitWidth(163);
		ImageView image2 = new ImageView (hats.get(1).image);
		image2.setFitHeight(163);
		image2.setFitWidth(163);
		ImageView image3 = new ImageView (hats.get(2).image);
		image3.setFitHeight(163);
		image3.setFitWidth(163);
		ImageView image4 = new ImageView (hats.get(3).image);
		image4.setFitHeight(163);
		image4.setFitWidth(163);
		ImageView image5 = new ImageView (hats.get(4).image);
		image5.setFitHeight(163);
		image5.setFitWidth(163);
		ImageView image6 = new ImageView (hats.get(5).image);
		image6.setFitHeight(163);
		image6.setFitWidth(163);
		

		/**Here we've given the users options to sort their hats by price. They can specify what field they want and then the images will sort 
		  based on their prices via comparator**/
		ChoiceBox<String> cb = new ChoiceBox<>();
		cb.getItems().addAll("Please Select Your Options", "Sort High to Low","Sort Low To High");
		cb.setValue("Please Select Your Options");
			    
		//This says the name and price of the hats based on the prices stored already. 
		Text condimentHat = new Text();
		condimentHat.setText(hats.get(0).name + "\t $" + hats.get(0).price);
		condimentHat.setFill(Color.WHITE);

		Text cerealHat = new Text();
		cerealHat.setText(hats.get(1).name + "\t $" + hats.get(1).price);
		cerealHat.setFill(Color.WHITE);

		Text calienteHat = new Text();
		calienteHat.setText(hats.get(2).name + "\t $" + hats.get(2).price);
		calienteHat.setFill(Color.WHITE);

		Text satMorningHat = new Text();
		satMorningHat.setText(hats.get(3).name + "\t $" + hats.get(3).price);
		satMorningHat.setFill(Color.WHITE);

		Text birdHat = new Text();
		birdHat.setText(hats.get(4).name + "\t $" + hats.get(4).price);
		birdHat.setFill(Color.WHITE);

		Text hotDog = new Text();
		hotDog.setText(hats.get(5).name + "\t $" + hats.get(5).price);
		hotDog.setFill(Color.WHITE);

		VBox masterVBox = new VBox (25);
		HBox titleBox = new HBox(150);
		VBox vb2 = new VBox(25);
		HBox searchHBox = new HBox(25);
		HBox hMaster = new HBox (25);
		VBox VBoxA = new VBox(25);
		VBox VBoxB = new VBox(25);
		VBox VBoxC = new VBox(25);

		masterVBox.setId("searchPage");
		
		
		//ADD TO VERTICAL BOX
		titleBox.getChildren().addAll(title, welcome, logout);
		masterVBox.getChildren().addAll(titleBox, vb2);
		masterVBox.setAlignment(Pos.BASELINE_CENTER);
		masterVBox.setPadding(new Insets(25,25,25,25));

		hMaster.getChildren().addAll(VBoxA, VBoxB, VBoxC);
		hMaster.setAlignment(Pos.CENTER);
		

		searchHBox.getChildren().addAll(cb);
		searchHBox.setAlignment(Pos.CENTER);

		
		vb2.getChildren().addAll(searchHBox, hMaster);
		VBoxA.getChildren().addAll(image, condimentHat, image4, satMorningHat);
		VBoxB.getChildren().addAll(image2, cerealHat, image5, birdHat);
		VBoxC.getChildren().addAll(image3, calienteHat, image6, hotDog);




		Scene searchPage = new Scene (masterVBox, 800, 600);
		searchPage.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
		
		//Goes to the browse home page
		browse.setOnAction(e -> {
		logout.setText("Home");	
		registeredPrompt.setVisible(false);
		primaryStage.setScene(searchPage);
		
		});
		//Goes to register page
		signUp.setOnAction(e -> {	
			primaryStage.setScene(registerPage);
		});
		//Goes back to the login page
		cancelBT.setOnAction(e -> {
			primaryStage.setScene(loginPage);
		});
		//Submits all the user entered credentials. if all goes correctly and all the fields are entered, it shows the 'registration complete' message.
		submitBT.setOnAction(e -> {
			if(Controller.createAccount(usernameTF.getText(), firstNameTF.getText(), lastNameTF.getText(), emailTF.getText(), passwordTF.getText()).equals("ERROR999")){
				return;
			}else{
			primaryStage.setScene(loginPage);
			registeredPrompt.setText("Registration complete. Log in now!");
			registeredPrompt.setVisible(true);
			}
		});

		submitLogin.setOnAction(e -> {
			if(Controller.login(usnInput.getText(), pswInput.getText()) == 1){
					welcome.setText("Welcome " + Controller.setWelcome(usnInput.getText()) + "!");
					logout.setText("Logout");
					registeredPrompt.setVisible(false);
					primaryStage.setScene(searchPage);
					registeredPrompt.setVisible(true);
					usnInput.setText("");
					pswInput.setText("");
					//If not, however, it shows a login failed message
					registeredPrompt.setText("Login Failed!");

			}else{
				registeredPrompt.setVisible(true);
				usnInput.setText("");
				pswInput.setText("");
				registeredPrompt.setText("Login Failed!");
			}
			usnInput.setText("");
			pswInput.setText("");
		});
		
		logout.setOnAction(e -> {
		primaryStage.setScene(loginPage);
		registeredPrompt.setVisible(false);
		});
		
		//Again, this is the functionality for the sorting by price based on a compareTo in the Hat.java file. 
		cb.setOnAction(e ->{
			if(cb.getSelectionModel().getSelectedItem().equals("Sort High to Low")){
				Collections.sort(hats, Collections.reverseOrder());
				System.out.println("Sorted... hat 1: " + hats.get(0).name + "\t $" + hats.get(0).price);
				
			}else if(cb.getSelectionModel().getSelectedItem().equals("Sort Low To High")){
				Collections.sort(hats);
				System.out.println("Sorted... hat 1: " + hats.get(0).name + "\t $" + hats.get(0).price);
			}
			//Pulls images from the hats Array List.
			image.setImage(hats.get(0).image);
			image2.setImage(hats.get(1).image);
			image3.setImage(hats.get(2).image);
			image4.setImage(hats.get(3).image);
			image5.setImage(hats.get(4).image);
			image6.setImage(hats.get(5).image);
			//Sets their text / prices from the Array List.
			condimentHat.setText(hats.get(0).name + "\t $" + hats.get(0).price);
			cerealHat.setText(hats.get(1).name + "\t $" + hats.get(1).price);
			calienteHat.setText(hats.get(2).name + "\t $" + hats.get(2).price);
			satMorningHat.setText(hats.get(3).name + "\t $" + hats.get(3).price);
			birdHat.setText(hats.get(4).name + "\t $" + hats.get(4).price);
			hotDog.setText(hats.get(5).name + "\t $" + hats.get(5).price);
		});
		
	}

}
