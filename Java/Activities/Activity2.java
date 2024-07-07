package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {

		int a[]= {10, 77, 10, 54, -11, 10};
		int searchNum=10;
		int fixedSum=30;
    System.out.println("The Array is: " + Arrays.toString(a));
    System.out.println("The result is: " + result(a, searchNum, fixedSum));
	}
	
	public static boolean result(int[] numbers, int searchNum, int fixedSum) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int number : numbers) {
   
            if (number == searchNum) {
                sum += searchNum;
            }

            if (sum > fixedSum) {
                break;
            }
        }

        return sum == fixedSum;
	}
	
}



