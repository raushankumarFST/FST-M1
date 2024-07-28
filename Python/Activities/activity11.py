fruit_shop = {
    "apple": 5,
    "banana": 6,
    "orange": 7,
    "peaches": 8
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")