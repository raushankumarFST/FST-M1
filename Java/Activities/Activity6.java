package activities;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
	
		Scanner input =new Scanner(System.in);
		System.out.println("Passanger count: ");
		
		int count= input.nextInt();
		Plane A6= new Plane(count);
		System.out.print("Please enter Passangers name: ");
		
		input.nextLine();
		for(int i=0;i<count;i++) {
			A6.onboard(input.nextLine());
		}
		
		System.out.println("Plane took off at: " + A6.takeOff());
        System.out.println("People on the plane: " + A6.getPassengers());
        Thread.sleep(5000);
        A6.land();
        System.out.println("Plane landed at: " + A6.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + A6.getPassengers());
	}

}