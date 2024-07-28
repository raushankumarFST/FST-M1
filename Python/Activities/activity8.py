numbers=list(input("Enter a sequence of comma separated values: ").split(","))
print("User entered numbers are: ", numbers)
firstNumber = numbers[0]
lastNumber = numbers[-1]
if (firstNumber == lastNumber):
    print(True)
else:
    print(False)