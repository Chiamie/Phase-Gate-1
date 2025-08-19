public class TaskEight {
public static void main(String[] args){

int[] studentAges = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
System.out.print("The sum of student ages is " + getSumOf(studentAges));


}


public static int getSumOf(int[] arrayOfNumbers){
	int sum = 0;
	for(int index = 0; index < arrayOfNumbers.length; index++){
			sum += arrayOfNumbers[index];
	}
	return sum;

}










}



