package application;

import javafx.scene.image.Image;

//Implements Comparable, meaning this way it can compare the prices stored in the ArrayList and sort them all.
public class Hat implements Comparable<Object> {

	
	String name;
	double price;
	Image image;
	
	
	public Hat(String name, double price, Image image)
	{
		this.name = name;
		this.price = price;
		this.image = image;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}



	public double getPrice()
	{
		return price;
	}


	public void setPrice(double price)
	{
		this.price = price;
	}


	//compareTo method that compares the prices of the hats.
	@Override
	public int compareTo(Object compareHat) {
		Hat h = (Hat)compareHat;
		return (int) (this.price - h.price);
	}
	
	
	
	
	
	
	
}
