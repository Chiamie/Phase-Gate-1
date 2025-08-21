import unittest
import inspect
from grocery_manager_app import add_this_grocery
from grocery_manager_app import remove_this_grocery
from grocery_manager_app import display_groceries

class TestAddThisGroceryFunction(unittest.TestCase):
	def test_that_add_this_grocery_function_accepts_1_argument(self):
		function_signature = inspect.signature(add_this_grocery)
		dic_parameter = function_signature.parameters
		self.assertEqual(len(dic_parameter), 1)
	def test_that_the_add_this_grocery_function_raises_validation_when__argument_is_not_string(self):
		self.assertRaises(TypeError, add_this_grocery, 32.8)
	def test_that_the_add_this_grocery_function_raises_validation_if_input_is_empty(self):
		self.assertRaises(ValueError, add_this_grocery, "")
	def test_that_the_add_this_grocery_function_returns_correct_result(self):
		result = add_this_grocery("yam")
		self.assertEqual(result, 'Added successfully')



class TestRemoveThisGroceryFunction(unittest.TestCase):
	def test_that__the_remove_this_grocery_function_accepts_1_argument(self):
		function_signature = inspect.signature(remove_this_grocery)
		dic_parameter = function_signature.parameters
		self.assertEqual(len(dic_parameter), 1)
	def test_that_the_remove_this_grocery_function_raises_validation_when__argument_is_not_string(self):
		self.assertRaises(TypeError, remove_this_grocery, 32.8)
	def test_that_the_remove_this_grocery_function_raises_validation_if_input_is_empty(self):
		self.assertRaises(ValueError, remove_this_grocery, "")
	def test_that_the_remove_this_grocery_function_returns_correct_result(self):
		result = add_this_grocery("yam")
		self.assertEqual(result, 'Added successfully')


