def get_father_age(current_father_age, current_son_age):
	if not isinstance(current_father_age, int) or not isinstance(current_son_age, int):
		raise TypeError("Input must be integer")
	if current_father_age == 0 or current_son_age == 0:
		raise ValueError("Input cannot be empty")
	if current_father_age < 0 or current_son_age < 0:
		raise ValueError("Input cannot be negative")

	twice_son_age = current_son_age * 2
	result = current_father_age - twice_son_age
	if result < 0:
		return (f'The father will be twice as old in {result * -1} years time')
	elif result == 0:
		return ("The father is currently twice the son's age")

	else:
		return (f'The father was twice as old {result} years ago')


father_age = 69;
son_age = 29;
print(get_father_age(father_age, son_age))




print(get_father_age(50, 25))

print(get_father_age(50, 35))




