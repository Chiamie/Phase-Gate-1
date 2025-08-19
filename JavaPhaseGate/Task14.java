public class Task14 {
public static void main(String[] args){

int studentAges = 5;
System.out.print(getFactorialOf(studentAges));


}


public static int getFactorialOf(int number){
	int factorial = 1;
	for(int index = number; index >= 1; index--){
		factorial *= index;
		
		
	}
	return factorial;
}










}







