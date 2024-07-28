import pytest
import math

def test_addition():
	
	num1 = 19
	num2 = 67
    
	sum = num1 + num2

	assert sum == 86

def test_subtraction():
  
	num1 = 87
	num2 = 31
    
	diff = num1 - num2

	assert diff == 56

def test_multiplication():
  
	num1 = 55
	num2 = 20
    
	prod = num1 * num2

	assert prod == 1100

def test_division():
  
	num1 = 100
	num2 = 5
    
	quot = num1 / num2

	assert quot == 20