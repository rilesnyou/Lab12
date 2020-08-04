
public class UsedCars extends Car {

	private String make;
	private String model;
	private int year;
	private double price;
	private double mileage;

	public UsedCars() {
		super();
	}

	public UsedCars(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;

	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return super.toString() + "UsedCars " + mileage + " miles";
	}

}
