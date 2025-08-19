import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class Task3Test{
@Test	
public void testWhenInputLengthIsOne(){
	String[] names = {"Amaka"};
		
	Task3 task3 = new Task3();
	String result = task3.displayTextOf(names);
	
	assertEquals(result, "Amaka likes this");
}

@Test	
public void testWhenInputLengthIsTwo(){
	String[] names = {"Amaka", "Emma"};
	
	Task3 task3 = new Task3();
	String result = task3.displayTextOf(names);
	
	boolean finalResult = result.equalsIgnoreCase("Amaka and Emma likes this");
	assertTrue(finalResult);
	
	//assertEquals(result, "Amaka and Emma likes this");

	
}
@Test	
public void testWhenInputLengthIsThree(){
	String[] names = {"Amaka", "Emma", "Delight"};
	
	Task3 task3 = new Task3();
	String result = task3.displayTextOf(names);
	
	assertEquals(result, "Amaka, Emma and Delight likes this");
}

}


