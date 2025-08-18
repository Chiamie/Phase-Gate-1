import java.util.Arrays;
public class TaskNine {
public static void main(String[] args){

int[] studentAges = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
System.out.println(Arrays.toString(getReverseOf(studentAges)));


}


public static int[] getReverseOf(int[] arrayOfNumbers){
	int[] reverseArray = new int[arrayOfNumbers.length];
	int count = 0;
	for(int index = arrayOfNumbers.length - 1; index >= 0; index--){
			reverseArray[count] = arrayOfNumbers[index];
			count++;
	}
	return reverseArray;

}










}




