groceries = []


def add_this_grocery(name_of_item):
	if not isinstance(name_of_item, str):
		raise TypeError("Input must be a string")
	if name_of_item == "":
		raise ValueError("number_list cannot be empty")
	groceries.append(name_of_item)
	return "Added successfully"

def remove_this_grocery(name_of_item):
	if not isinstance(name_of_item, str):
		raise TypeError("Input must be a string")
	if name_of_item == "":
		raise ValueError("number_list cannot be empty")
	groceries.remove(name_of_item)
	return "Removed successfully"

def display_groceries():
	if not isinstance(list_of_integers, list):
		raise TypeError("list_of_integers must be a list")
	if all(type(item) != int for item in list_of_integers):
			raise ValueError("list_of_integers must be all integers")
	for item in groceries:
		print(item)
		
def exit():
	return False



list_of_menu_options = True
while(list_of_menu_options):
	menu = """
		1. Add Grocery
		2. Remove Grocery
		3. Show All Groceries
		0. Exit
		"""
	print(menu)
	user_menu_choice = int(input("Select and option: "))
	match(user_menu_choice):
		case 1:
			user_item_add = input("Add this Grocery: ")
			print(add_this_grocery(user_item_add))
		case 2:
			user_item_remove = input("Remove this Grocery: ")
			print(remove_this_grocery(user_item_remove))
		case 3:
			display_groceries()
		case 0:
			list_of_menu_options = exit();



 		
			


