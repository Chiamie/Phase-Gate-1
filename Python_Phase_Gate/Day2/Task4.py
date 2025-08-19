def is_possible(gallon_left):
	distance = 50;
	miles_per_gallon = 25
	if (miles_per_gallon * gallon_left == distance):
		return True
	else:
		return False



gallon_available = 2
print(is_possible(gallon_available))
