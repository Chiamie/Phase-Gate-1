import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Task1Test{
@Test	
public void testWhenSonAgeIsAboveHalfFatherAge(){
	int firstNumber = 69;
	int secondNumber = 29;
	
	Task1 task1 = new Task1();
	int result = task1.getFatherAge(firstNumber, secondNumber);
	
	assertEquals(result, 11);
}

@Test	
public void testWhenSonAgeIsHalfFatherAge(){
	int firstNumber = 60;
	int secondNumber = 30;
	
	Task1 task1 = new Task1();
	int result = task1.getFatherAge(firstNumber, secondNumber);
	
	assertEquals(result, 0);
}	

@Test	
public void testWhenSonAgeIsBelowHalfFatherAge(){
	int firstNumber = 60;
	int secondNumber = 15;
	
	Task1 task1 = new Task1();
	int result = task1.getFatherAge(firstNumber, secondNumber);
	
	assertEquals(result, 30);
}	

}
