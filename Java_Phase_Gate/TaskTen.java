public class TaskTen {
public static void main(String[] args){

int[] studentAges = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
getMaximumAndMinimumOf(studentAges);


}


public static void getMaximumAndMinimumOf(int[] arrayOfNumbers){
	int minimum = arrayOfNumbers[0];
	int maximum = arrayOfNumbers[0];
	int count = 0;
	for(int index = 0; index < arrayOfNumbers.length; index++){
		if(arrayOfNumbers[index] > maximum)
			maximum = arrayOfNumbers[index];
		else if (arrayOfNumbers[index] < minimum)
			minimum = arrayOfNumbers[index];

	}
	System.out.printf("The maximum and minimum in the array is %d and %d respectively.", maximum, minimum);

}










}





