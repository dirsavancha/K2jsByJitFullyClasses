package com.k2js.usescases.student;

class Car {

	String carType, name, fuelType, chasisNumber, milege;
	float price;

	Car(String carType, String fuelType, float price, String milege, String chasisNumber) {

		this.carType = carType;
		this.fuelType = fuelType;
		this.price = price;
		this.milege = milege;
		this.chasisNumber = chasisNumber;
	}

	Car(String carType, String name, String fuelType, float price, String milege, String chasisNumber) {
		this(carType, fuelType, price, milege, chasisNumber);
		this.name = name;

	}

	@Override
	public String toString() {
		return "Car [carType=" + carType + ", name=" + name + ", fuelType=" + fuelType + ", chasisNumber="
				+ chasisNumber + ", price=" + price + ", milege=" + milege + "]";
	}

}



class CarDealer {

	static String[] dealerLocation;
	static int insurance;

	CarDealer(int insurance, String... dealerLocation) {

		this.insurance = insurance;
		this.dealerLocation = dealerLocation;

	}
	
	public static String sellingANewCar(Customer cust,Car c){
		if (cust.citizenship.equalsIgnoreCase("Indian")) {
			for (String location : CarDealer.dealerLocation) {
				if (cust.custLocation.equalsIgnoreCase(location)) {
					System.out.println(c);

					boolean b1 = c.fuelType.equalsIgnoreCase("petrol")
							? true
							: false;

					boolean b2 = (insurance > cust.wantedInsurance) ? true
							: false;
					if(b1&&b2)
					   return "Insurance is applicable and we will deliver car soon...!";
					else
						return "Insurance not applicable and car delivery process may delay";
				} else {
					return "location unmatched";
				}
			}
			return "You are indian";
		} else

			return "You are not indian";
	}

	

}

class Customer {
	static String custName, custLocation, citizenship;
	static int wantedInsurance;

	Customer(String custName, String custLocation, String citizenship, int wantedInsurance) {
		this.custName = custName;
		this.custLocation = custLocation;
		this.citizenship = citizenship;
		this.wantedInsurance = wantedInsurance;
	}

	public static void buyNewCar(String s) {
		System.out.println(s);
		
   }
}

public class PurchasingANewCar {

	public static void main(String[] args) {
		Car obj = new Car("seadan","Hundai", "Petrol", 500000.f, "15 kmpl", "12345a6");

		CarDealer carDealer = new CarDealer(3, "Whitefield", "Marathalli", "IndiraNagar");
		

		Customer c1 = new Customer("Ram", "Whitefield", "Indian", 1);
		String s = carDealer.sellingANewCar(c1,obj);
		Customer.buyNewCar(s);
		

	}
}
