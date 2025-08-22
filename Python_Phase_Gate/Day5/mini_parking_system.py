import mini_parking_system_functions

parking_lot = [[0, 1, 1, 1, 1], [1, 1, 1, 1, 1], [0, 1, 1, 1, 1], [1, 1, 0, 0, 1]]
space_position = (3, 3)
parking_lot_options = True
while(parking_lot_options):
	display_options = """
		1. See if there is available space
		2. See all available spaces
		3. Enter a specific space position in the park lot
		4. Enter the first space position from the left in the park lot
		5. Leave the park lot
		0. Exit
		"""
	print(display_options)
	user_response = int(input("Choose an option: "))
	match(user_response):
		case 1:
			print(mini_parking_system_functions.is_available(parking_lot))
		case 2:
			print(mini_parking_system_functions.display_all_available_spaces(parking_lot))
		case 3:
			number1, number2 = space_position
			print(mini_parking_system_functions.enter_this_space_position(number1, number2, parking_lot))
		case 4:
			print(mini_parking_system_functions.enter_the_parking_lot(parking_lot))
		case 5:
			number1, number2 = space_position
			print(mini_parking_system_functions.get_off_the_park(number1, number2, parking_lot))
		case 0:
			parking_lot_options = mini_parking_system_functions.exit()
	
