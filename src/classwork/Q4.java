package classwork;

public class Q4 {

	public static void main(String[] args) {
		Car fordMustang = new Car();
		SUV chevySuburban = new SUV();
		Truck f150 = new Truck();
		Motorcycle multistrada = new Motorcycle();

		Mechanic.process(fordMustang);

		Mechanic.process(chevySuburban);

		Mechanic.process(f150);

		//Mechanic.process(multistrada);
		
		public boolean isGreater(Object first, Object second) {
			  double one = first.doubleValue();
			  double two = second.doubleValue();
			  return one > two;
			}


			public boolean isGreater(Float first, Float second) {}
			//public boolean isGreater(Double first, Double second) {}
			public boolean isGreater(Number first, Number second) {}
			public boolean isGreater(Object first, Object second) {}


	}

}
