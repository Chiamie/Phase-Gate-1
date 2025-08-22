def is_available(parking_lot):
	for lot_row in parking_lot:
		for slot in lot_row:
			if slot == 0:
				return "True"
			else:
				return "False"

		
def enter_the_parking_lot(car):
	if is_available(parking_lot) == True:
		for lot_row in parking_lot:
			for slot in lot_row:
				if slot == 0:
					slot = car
		return "Parked Successfully"
	else:
		return "There is no available space in the park"
				

parking_lot = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
available_space = is_available(parking_lot)
car_to_park = 1
print(enter_the_parking_lot(car_to_park))