package activities;

public class Car {

		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		
		Car(){	
			tyres=4;
			doors=4;		
		}
		
		void dispalyCharacteristics(){
			System.out.println("color of the BMW: " + color);
			System.out.println("transmission of the BMW: " + transmission);
			System.out.println("make of the BMW: " + make);
			System.out.println("tyres on the BMW: " + tyres);
			System.out.println("doors on the BMW: " + doors);
			
		}
		
		void accelarate() {
			System.out.println("Car is moving forward");
		}
		
		void brake() {
			System.out.println("Car has stopped");
		}


}
