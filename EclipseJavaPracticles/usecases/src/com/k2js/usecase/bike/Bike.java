// Find the bike is in which gear at diff speeds

package com.k2js.usecase.bike;

public class Bike {
	int maxSpeed, speed;
	String gear;

	public Bike(int Speed) {

		this.speed = Speed;
	}

	public Bike(String gear, int speed, int maxSpeed) {
		this(speed);
		this.maxSpeed = maxSpeed;
	}

	void isMoving() {
		if (speed > 0 && speed < 20) {
			gear = "First Gear";
			System.out.println("Bike is in" + gear);

		} else if (speed > 21 && speed < 40) {
			gear="Second Gear";
			System.out.println("Bike is in "+gear);

		}else if(speed>41 && speed<60) {
			gear="Third Gear";
			System.out.println("Bike is in "+gear);
			
		}else if(speed>61 && speed<=100) {
			gear="Fourth Gear";
			System.out.println("Bike is in "+gear);
			
		}else if(speed==0) {
			System.out.println("Bike is stopped");
		}
		
		else {
			System.out.println("Speed not mentioned user input is wrong");
		}
		
	}
	public static void main(String[] args) {
		Bike bi=new Bike(0);
		bi.isMoving();
	}

	

}
