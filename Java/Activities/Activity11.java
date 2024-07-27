package activities;

import java.util.HashMap;

public class Activity11 {
	public static void main(String[] args) {
		HashMap<Integer, String> colour = new HashMap<Integer, String>();
		colour.put(1, "Red");
		colour.put(2, "Blue");
		colour.put(3, "Green");
		colour.put(4, "Black");
		colour.put(5, "Pink");

		System.out.println("Current set: " + colour);

		colour.remove(4, "Black");
		System.out.println("Current Size of set: " + colour.size());
		System.out.println("Updated set: " + colour);

		if (colour.containsValue("Purple")) {
			System.out.println("Purple colour is present in the set");
		} else {
			System.out.println("Purple colour is not present in the set");
		}
		
		System.out.println("Current Size of set: " + colour.size());

	}

}