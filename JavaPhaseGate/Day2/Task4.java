public class Task4{
public static void main(String[] args){


int gallonAvailable = 2;
System.out.print(isPossible(gallonAvailable));


}
public static boolean isPossible(int gallonLeft){
	int distance = 50;
	int milesPerGallon = 25;
	if (milesPerGallon * gallonLeft == distance)
		return true;
	else
		return false;
}

}
