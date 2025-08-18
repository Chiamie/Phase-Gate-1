public class TaskSeven {
public static void main(String[] args){

int[] studentAges = {56, 34, 12, 87, 12, 90};
System.out.print("The smallest number in array is " + getSmallestOf(studentAges));


}


public static int getSmallestOf(int[] arrayOfNumbers){
	int smallest = arrayOfNumbers[0];
	for(int index = 0; index < arrayOfNumbers.length; index++){
		if (arrayOfNumbers[index] < smallest)
			smallest = arrayOfNumbers[index];
	}
	return smallest;

}










}


