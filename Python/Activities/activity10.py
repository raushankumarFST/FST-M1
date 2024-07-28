numbers=list(input("Enter a sequence of comma separated values: ").split(","))
print("User entered numbers are: ", numbers)
 
print('Elements which are divisible by 5: ')
for num in numbers:
    if (int(num) % 5 == 0):
        print(num)