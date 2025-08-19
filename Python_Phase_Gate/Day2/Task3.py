def display_text_of(array_of_names):
	if len(array_of_names) == 1:
		return (f'{array_of_names[0]} likes this')
	elif len(array_of_names) == 2:
		return (f'{array_of_names[0]} and {array_of_names[1]} like this')

	elif len(array_of_names) == 3:
		return (f'{array_of_names[0]}, {array_of_names[1]} and {array_of_names[2]} like this')
	elif len(array_of_names) >= 4:		
		count = 0;
		for value in range(2, len(array_of_names)):
			count += 1
		return (f'{array_of_names[0]}, {array_of_names[1]} and {count} like this')

	else:
		return 'No one likes this';
	


print(display_text_of(['Peter']));
print(display_text_of(['Peter', 'James']));
print(display_text_of(['Peter', 'Feyi', 'Silver']));
print(display_text_of(['Peter', 'Eloka', 'Amaka', 'Tosin']));
print(display_text_of(['Peter', 'Eloka', 'Amaka', 'Tosin', 'Basit', 'Femi', 'Rita']));
print(display_text_of([]));

