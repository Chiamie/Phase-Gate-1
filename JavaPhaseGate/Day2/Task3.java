public class Task3{
public static void main(String[] args){

String[] name = {"Peter"};
String[] names = {"Peter", "James"};
String[] studentNames = {"Peter", "Feyi", "Silver"};
String[] members = {"Peter", "Eloka", "Amaka", "Tosin"};
String[] villagers = {"Peter", "Eloka", "Amaka", "Tosin", "Basit", "Femi", "Rita"};
String[] villagers1 = {};


System.out.println(displayTextOf(name));
System.out.println(displayTextOf(names));
System.out.println(displayTextOf(studentNames));
System.out.println(displayTextOf(members));
System.out.println(displayTextOf(villagers));
System.out.println(displayTextOf(villagers1));


}

public static String displayTextOf(String[] arrayOfNames){
	
	if (arrayOfNames.length == 1)
		return String.format("%s likes this", arrayOfNames[0]);
	//else if (arrayOfNames.length == 1)
		//return String.format("%s likes this ", arrayOfNames[0]);
	else if (arrayOfNames.length == 2)
		return String.format("%s and %s likes this", arrayOfNames[0], arrayOfNames[1]);
	else if (arrayOfNames.length == 3)
		return String.format("%s, %s and %s likes this", arrayOfNames[0], arrayOfNames[1], arrayOfNames[2]);
	else if (arrayOfNames.length >= 4){
		int count = 0;
		for(int index = 2; index < arrayOfNames.length; index++){
			count++;
		}
		return String.format("%s, %s and %s likes this %n", arrayOfNames[0], arrayOfNames[1], count);
	}else
		return "No one likes this";
		
		
		
	
}

}


	


