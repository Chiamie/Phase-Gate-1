import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Task2Test{
@Test	
public void testWhenScoresAreFrom90(){
	int firstNumber = 99;
	int secondNumber = 90;
	int thirdnumber = 96;
	
	Task2 task2 = new Task2();
	int result = task2.getAverageOf(firstNumber, secondNumber, thirdnumber);
	
	assertEquals(result, 'A');
}

@Test	
public void testWhenScoresAreFrom80ButBelow90(){
	int firstNumber = 80;
	int secondNumber = 89;
	int thirdnumber = 83;
	
	Task2 task2 = new Task2();
	int result = task2.getAverageOf(firstNumber, secondNumber, thirdnumber);
	
	assertEquals(result, 'B');
}
@Test	
public void testWhenScoresAreFrom70ButBelow80(){
	int firstNumber = 71;
	int secondNumber = 75;
	int thirdnumber = 70;

	
	Task2 task2 = new Task2();
	int result = task2.getAverageOf(firstNumber, secondNumber, thirdnumber);
	
	assertEquals(result, 'C');
}

}

