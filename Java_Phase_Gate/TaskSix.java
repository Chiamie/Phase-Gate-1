public class TaskSix {
public static void main(String[] args){

int[] studentAges = {56, 34, 12, 87, 12, 90};
System.out.print("The largest number in array is " + getLargestOf(studentAges));


}


public static int getLargestOf(int[] arrayOfNumbers){
	int largest = arrayOfNumbers[0];
	for(int index = 0; index < arrayOfNumbers.length; index++){
		if (arrayOfNumbers[index] > largest)
			largest = arrayOfNumbers[index];
	}
	return largest;

}










}

