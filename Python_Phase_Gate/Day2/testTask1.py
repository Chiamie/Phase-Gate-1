import unittest 
import inspect
from Task1 import get_father_age


class TestGetFatherAgeFunction(unittest.TestCase):
	def test_that_get_father_age_function_accepts_2_arguments(self):
		function_signature = inspect.signature(get_father_age)
		dic_parameter = function_signature.parameters
		self.assertEqual(len(dic_parameter), 2)
	def test_that_the_get_father_age_function_raises_validation_when__argument_is_not_integer(self):
		self.assertRaises(TypeError, get_father_age, "string", 32.8)
	def test_that_the_get_father_age_function_raises_validation_if_arguement_is_negative_number(self):
		self.assertRaises(ValueError, get_father_age, -2, -3)
	def test_that_the_get_father_age_function_raises_validation_if_input_is_empty(self):
		self.assertRaises(ValueError, get_father_age, 0, 0)
	def test_that_the_get_father_age_function_returns_correct_result(self):
		result = get_father_age(69, 29)
		self.assertEqual(result, 'The father was twice as old 11 years ago')

