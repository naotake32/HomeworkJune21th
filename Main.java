import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		//Q1.
//		ArrayList<Integer> randomNumber = new ArrayList<Integer>();		
//		
//		for(int i=0;i<50;i++){
//			int randomNum = (int)(Math.random() * 50) + 1;
//			randomNumber.add(randomNum);
//			}
//		System.out.println(randomNumber);
//		
//		int inputVal = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("input the number: ");
//		inputVal = scanner.nextInt();
//		
//	    boolean searchRes = randomNumber.contains(inputVal);
//	    
//	    if(searchRes) {
//	    	System.out.print("the number is in the list");
//	    }else {
//	    	System.out.print("the number is not in the list");
//	    }
		
//		Q2.
//	ArrayList<Integer> randomNumbQ2 = new ArrayList<Integer>();		
//		
//		for(int i=0;i<10;i++){
//			int randomNum = (int)(Math.random() * 50) + 1;
//			randomNumbQ2.add(randomNum);
//			}
//		System.out.println(randomNumbQ2);
//		
//		ArrayList<Integer> cloneArr = (ArrayList<Integer>) randomNumbQ2.clone();
//		System.out.println(cloneArr);
//		
//		cloneArr.set(9, -5);
//		
//		System.out.println(cloneArr);
//	}
//}
//		
		//Q3.
		
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(new Car("TOYOTA", "AQUA", 2015));
		carList.add(new Car("HONDA", "VEZEL", 2019));
		carList.add(new Car("MAZDA", "CX-5", 2020));
		
		Collections.sort(carList, new CarComparator());
		System.out.println(carList);
	}

}

class Car {
	String make;
	String model;
	int year;
	
	public Car(String make,  String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
}

class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		return c1.year < c2.year ? -1 : 1;
	}
}