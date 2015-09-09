package classwork;

public class Table implements Furniture {
	private double price;
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

}
