package classwork;

public class Chair implements Furniture {
	  private double price;
	  private String material;
	  public Chair(double price, String material) {
	    this.price = price;
	    this.material = material;
	  }
	  public double getPrice() {
	    return this.price;
	  }
	  
	  public String getMaterial() {
	    return this.material;
	  }
	}

