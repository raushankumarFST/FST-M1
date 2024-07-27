package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Toyota");
        myList.add("BMW");
        myList.add("Suzuki");
        System.out.println("Current list:" + myList);
        myList.add(3, "Mercedes");
        myList.add(1, "Audi");
        
        System.out.println("Updated list after adding:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Jaguar is in list: " + myList.contains("Jaguar"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Mercedes");
        System.out.println("Is Mercedes present in list: " + myList.contains("Mercedes"));
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}