package assignment5b;

import java.util.Arrays;

public class averagevaluecalc {
	
	int[] numbers = new int[] {-100, 100, 200, 300, 400, 500};
	
	int sum = 0;
	for(int i=0; i < numbers.length ; i++)
		sum = sum + numbers[i];
	double average = sum / numbers.length;
	
	System.out.println("The average value of the array (-100, 100, 200, 300, 400, 500) is: " + average);
	}

}
