import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {
	
	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new UsedCars("Ford", "Taurus", 1993, 9000, 75000));
		cars.add(new UsedCars("Honda", "Civic", 2000, 12000, 50000));
		cars.add(new UsedCars("Chevy", "Vette", 2005, 28000, 23000));
		cars.add(new Car("Tesla", "Model S", 2019, 40000));
		cars.add(new Car("Ford", "Mustang", 2017, 32000));
		cars.add(new Car("Chevy", "Camaro", 2018, 34000));
		
	}
	public static void main(String[] args) {
		boolean repeat;
		String input;
		int choice = 0;
		Car buy = cars.get(choice + 1);
		System.out.println("Here's a list of our used and slightly less used cars: ");
		listCars();
//		System.out.println("Which car would you like?");
		
		do {
		System.out.println("Which car would you like?");
		choice = scnr.nextInt();
		showCarById(choice);
		System.out.println("Is this the car you would like? (Y/N): ");
		input = scnr.next();
		repeat = "n".equalsIgnoreCase(input);
		} while (repeat);
		if (input.equalsIgnoreCase("y")) {
		System.out.println("Congrats let's get you into that "  + buy);
		buyCar(choice);
		listCars();
		} 
	}
	
	public static void listCars() {
		for (int i = 0;i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}
	}
	
	public static void showCarById(int id) {
		System.out.println(cars.get(id-1));
	}
	
	public static void buyCar(int id) {
		cars.remove(id-1);
	}

}
