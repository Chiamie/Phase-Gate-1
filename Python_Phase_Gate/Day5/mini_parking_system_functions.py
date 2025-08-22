"""
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
"""

def is_available(parking_lot):
	for lot_row in parking_lot:
		for slot in lot_row:
			if slot == 0:
				return True
			
	return False

def display_all_available_spaces(parking_lot):
	return parking_lot

					
def enter_this_space_position(number1, number2, parking_lot):
	if parking_lot[number1][number2] == 0:
		parking_lot[number1][number2] = 1
		return "Parked successfully"
	elif parking_lot[number1][number2] == 1:
		return "This space is not available."
	

def enter_the_parking_lot(parking_lot):
	if is_available(parking_lot) == True:
		for lot_row in range(0, len(parking_lot)):
			for slot in range(0, len(parking_lot[lot_row])):
				if parking_lot[lot_row][slot] == 0:
					parking_lot[lot_row][slot] = 1
					return "Parked successfully"
	else:
		return "There is no available space in the park"

def get_off_the_park(number1, number2, parking_lot):
	parking_lot[number1][number2] = 0
	return "Left successfully"

def exit():
	return False




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

