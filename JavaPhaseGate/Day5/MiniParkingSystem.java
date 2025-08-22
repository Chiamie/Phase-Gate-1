/**
=> This program represents a car park as rows and columns.
=> Each of the row is the line for parking car while the column is the specific position where the car is parked in a specific line.
=> In the car park, an empty space is 0 while a space parked with a car is 1.
=> Create a function to check if there is space in the car park or not.
=> Create a function that displays all the available spaces in the car park.
=> A user can specify the specific position they want, and if the position is available: The car is parked; else: "This space is not available."
=> A car can enter the parking lot if there’s a free slot. The car enters at the first available space from the right. If there is no free space, it should display: "There is no vailable space."
=> Also a car can leave the parking lot by specifying the specific slot position.
=> There should also be a function that allows the user to exit the program.
=> Arrange all the functions into cases to ensure easy navigation for the user.
**/





import java.util.Scanner;
import java.util.Arrays;

public class MiniParkingSystem {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int[][] parkingLot = {{1, 1, 1, 0, 1}, {0, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 0, 1, 1}};
int[] parkingLotNumber = {1, 0};
boolean parkingLotOptions = true;
while(parkingLotOptions){
	String displayOptions = """
		1. See if there is available space
		2. See all available spaces
		3. Enter a specific space position in the park lot
		4. Enter the first space position from the left in the park lot
		5. Leave the park lot
		0. Exit
		""";
	System.out.println(displayOptions);
	System.out.println("Select an option: ");
	int userResponse = input.nextInt();
	switch(userResponse){
		case 1:
			System.out.println(isAvailable(parkingLot)); break;
		case 2:
			int [] [] newArray = displayAllAvailableSpaces(parkingLot);
			System.out.println(Arrays.deepToString(newArray)); break;
		case 3:
			System.out.println(enterThisSpacePosition(parkingLotNumber, parkingLot)); break;
		case 4:
			System.out.println(enterTheParkingLot(parkingLot)); break;
		case 5:
			System.out.println(getOffThePark(parkingLotNumber, parkingLot)); break;
		case 0:
			parkingLotOptions = isExit(); break;
	}
}

}






public static boolean isAvailable(int[][] parkingLot){
	for(int rowNumber = 0; rowNumber < parkingLot.length; rowNumber++){
		for(int columnNumber = 0; columnNumber < parkingLot[rowNumber].length; columnNumber++){
			if (parkingLot[rowNumber][columnNumber] == 0)
				return true;
		}
	}
	return false;
}

public static int[][] displayAllAvailableSpaces(int[][] parkingLot){
	return parkingLot;
}
					
public static String enterThisSpacePosition(int[] parkingLotNumber, int[][] parkingLot){
	if (parkingLot[0][1] == 0){
		parkingLot[0][1] = 1;
		return "Parked successfully";
	} 		
		
	return "This space is not available.";
	
}


public static String enterTheParkingLot(int[][] parkingLot){
	if (isAvailable(parkingLot) == true){
		for(int rowNumber = 0; rowNumber < parkingLot.length; rowNumber++){
			for(int columnNumber = 0; columnNumber < parkingLot[rowNumber].length; columnNumber++){
				if (parkingLot[rowNumber][columnNumber] == 0){
					parkingLot[rowNumber][columnNumber] = 1;
					return "Parked successfully";
				}
			}
		}
	}
	
		
	return "There is no available space";
	
}

public static String getOffThePark(int[] parkingLotNumber, int[][] parkingLot){
	parkingLot[parkingLotNumber[0]][parkingLotNumber[1]] = 0;
	return "Left successfully";
	
}

public static boolean isExit(){
	return false;
	
}




}