package activities;

import activities.Addable;

interface Addable {

	int add(int x, int y);
}

public class Activity12 {

	public static void main(String[] args) {
		Addable ad1 = (a, b) -> (a + b);
		System.out.println("Total sum of ad1: " + ad1.add(30, 90));

		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};

		System.out.println("Total sum of ad2: " + ad2.add(300, 190));
	}

}
