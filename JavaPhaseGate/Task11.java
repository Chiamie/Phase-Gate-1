public class TaskEleven {
public static void main(String[] args){

int[] studentAges = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
getMaximumAndMinimumOf(studentAges);


}


public static void sortThis(int[] arrayOfNumbers){
	int minimum = arrayOfNumbers[0];
	int maximum = arrayOfNumbers[0];
	int temp;
	for(int index = 0; index < arrayOfNumbers.length; index++){
		for(int counter = 0; counter < arrayOfNumbers.length - 1; counter++){

		if(arrayOfNumbers[index] > arrayOfNumbers[counter])
			arrayOfNumbers[counter] = arrayOfNumbers[index]
			maximum = arrayOfNumbers[index];
		else if (arrayOfNumbers[index] < minimum)
			minimum = arrayOfNumbers[index];

	}
	System.out.printf("The maximum and minimum in the array is %d and %d respectively.", maximum, minimum);

}










}






