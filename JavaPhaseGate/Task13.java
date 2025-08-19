public class Task13 {
public static void main(String[] args){

int[] studentAges = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
System.out.print(getMaximumAndMinimumOf(studentAges));


}


public static int getMaximumAndMinimumOf(int[] arrayOfNumbers){
	int maximum = arrayOfNumbers[0];
	int secondMaximum = maximum;
	for(int index = 0; index < arrayOfNumbers.length; index++){
		if(arrayOfNumbers[index] > maximum){
			secondMaximum = maximum;
			maximum = arrayOfNumbers[index];
		}
		
	}
	return secondMaximum;
}










}






