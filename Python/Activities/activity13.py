def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += int(number)
	return sum

list1=list(input("Enter a sequence of comma separated values: ").split(","))
print("User entered numbers are: ", list1)

result = calculate_sum(list1)

print("The sum of all the elements is: " + str(result))