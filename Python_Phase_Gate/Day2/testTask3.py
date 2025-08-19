import unittest 
import inspect
from Task3 import display_text_of


class TestDisplayTextOfFunction(unittest.TestCase):
	def test_that_the_display_text_of_function_returns_correct_result_when_input_length_is_one(self):
		result = display_text_of(['Peter'])
		self.assertEqual(result, 'Peter likes this')
	def test_that_the_display_text_of_function_returns_correct_result_when_input_length_is_two(self):
		result = display_text_of(['Peter', 'James'])
		self.assertEqual(result, 'Peter and James like this')
	def test_that_the_display_text_of_function_returns_correct_result_when_input_length_is_three(self):
		result = display_text_of(['Peter', 'Feyi', 'Silver' ])
		self.assertEqual(result, 'Peter, Feyi and Silver like this')
	def test_that_the_display_text_of_function_returns_correct_result_when_input_length_is_three(self):
		result = display_text_of(['Peter', 'Feyi', 'Silver', 'Eloka', 'Amaka'])
		self.assertEqual(result, 'Peter, Feyi and 3 like this')





