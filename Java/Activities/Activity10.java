package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("BMW");
		hs.add("Toyota");
		hs.add("Suzuki");
		hs.add("Audi");
		hs.add("Jaguar");
		hs.add("Land rover");

		System.out.println("Size of current set: " + hs.size());
		System.out.println("Current set: " + hs);

		hs.remove("Land rover");
		System.out.println("Size of updated set: " + hs.size());
		System.out.println("Updated set: " + hs);

		if (hs.remove("FIAT")) {
			System.out.println("FIAT is removed from the set");
		} else {
			System.out.println("FIAT is not present in the set");
		}

		System.out.println("Is FIAT available in the set: " + hs.contains("FIAT"));
		System.out.println("Updated set: " + hs);

	}

}
