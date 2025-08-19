public class Task1 {
public static void main(String[] args){

int fatherAge = 40;
int sonAge = 18;
System.out.println(getFatherAge(fatherAge, sonAge));

System.out.println(getFatherAge(50, 25));

System.out.println(getFatherAge(50, 35));


}

public static int getFatherAge(int currentFatherAge, int currentSonAge){
	int twiceSonAge = currentSonAge * 2;
	int result = currentFatherAge - twiceSonAge;
	if (result < 0)
		return result * -1;
	else
		return result;
}












}