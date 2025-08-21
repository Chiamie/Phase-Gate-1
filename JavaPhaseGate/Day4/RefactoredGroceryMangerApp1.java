import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
public class RefactoredGroceryMangerApp1 {
static ArrayList<String> groceries = new ArrayList<String>();

public static void main(String[] args){
Scanner input = new Scanner(System.in);

boolean listOfMenuFunctions = true;
while(listOfMenuFunctions) {
	String menu = """
		1. Add Grocery
		2. Remove Grocery
		3. Show All Groceries
		0. Exit
		""";
	System.out.println(menu);
	System.out.println("Select and option: ");
	int optionSelected = input.nextInt();

	switch(optionSelected){
		case 1:
			System.out.println("Add a Grocery: ");
			String nameOfGrocery = input.next();
			RefactoredGroceryMangerApp1 refactoredGroceryMangerApp1 = new RefactoredGroceryMangerApp1();
			String response = refactoredGroceryMangerApp1.addThisGrocery(nameOfGrocery);
			System.out.println(response); 
			break;
		case 2:
			System.out.println("Remove a Grocery: ");
			nameOfGrocery = input.next();
			RefactoredGroceryMangerApp1 refactoredGroceryMangerApp2 = new RefactoredGroceryMangerApp1();
			response = refactoredGroceryMangerApp2.removeThisGrocery(nameOfGrocery); 
			break;
		case 3:
			System.out.println(Arrays.toString(displayAllGroceries())); break;
		case 0:
			listOfMenuFunctions = exit();

	}
}
}




public static String addThisGrocery(String name){
		
	groceries.add(name);
	return "Added successfully";
}


public static String removeThisGrocery(String name){
	
	groceries.remove(name);
	return "Removed successfully";
}

public static String[] displayAllGroceries(){
	int size = groceries.size();
	String[] arrayOfGrocery = new String[size];
	int count = 0;
	for(int index = 0; index < groceries.size(); index++){
		arrayOfGrocery[count] = groceries.get(index);
		count++;
	}
	return arrayOfGrocery;
}

public static boolean exit(){
	return false;
}












}











