list1=list(input("Enter a sequence of comma separated values: ").split(","))
list2=list(input("Enter a sequence of comma separated values: ").split(","))
print("List1: ",list1)
print("List2: ",list2)
list3=[]
for num in list1:
    if (int(num) % 2 !=0) :
        list3.append(num)
for num in list2:
    if (int(num) % 2==0) :
        list3.append(num)

print("Result list with odd number followed by even number: ")
print(list3)