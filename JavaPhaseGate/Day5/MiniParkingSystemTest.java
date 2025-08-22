import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class MiniParkingSystemTest{
@Test	
public void testisAvailableFunction(){
	int[][] parkingLot = {{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	boolean result = miniParkingSystem.isAvailable(parkingLot);
	
	assertEquals(result, true);
}

@Test	
public void testwhenAllTheParkingLotIsNotEmpty(){
	int[][] parkingLot = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	boolean result = miniParkingSystem.isAvailable(parkingLot);
	
	assertEquals(result, false);
}


@Test	
public void testwhenAllTheParkingLotIsEmpty(){
	int[][] parkingLot = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	boolean result = miniParkingSystem.isAvailable(parkingLot);
	
	assertEquals(result, true);
}

@Test	
public void testenterTheParkingLot(){
	int[][] parkingLot = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	String result = miniParkingSystem.enterTheParkingLot(parkingLot);
	
	assertEquals(result, "Parked successfully");
}

@Test	
public void testenterTheParkingLot1(){
	int[][] parkingLot = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	String result = miniParkingSystem.enterTheParkingLot(parkingLot);
	
	assertEquals(result, "There is no available space");
}

@Test	
public void testenterTheParkingLot2(){
	int[][] parkingLot = {{1, 1, 1, 1, 1}, {1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 1, 1}};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	String result = miniParkingSystem.enterTheParkingLot(parkingLot);
	
	assertEquals(result, "Parked successfully");
}


@Test	
public void testgetOffTheParkFunction(){
	int[][] parkingLot = {{1, 1, 1, 1, 1}, {1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 1, 1}};
	int[] parkingLotNumber = {3, 2};
		
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	String result = miniParkingSystem.getOffThePark(parkingLotNumber, parkingLot);
	
	assertEquals(result, "Left successfully");
}

@Test	
public void testExitFunction(){
			
	MiniParkingSystem miniParkingSystem = new MiniParkingSystem();
	boolean result = miniParkingSystem.isExit();
	
	assertEquals(result, false);

}

}
