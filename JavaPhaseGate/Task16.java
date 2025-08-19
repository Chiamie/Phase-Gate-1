public class Task16 {
public static void main(String[] args){

int studentAge = 55;
System.out.println(isUnitFive(studentAge));

int studentScore = 502;
System.out.print(isUnitFive(studentScore));

}


public static boolean isUnitFive(int number){
	if (number % 10 == 5)
		return true;
	else
		return false;
}










}







