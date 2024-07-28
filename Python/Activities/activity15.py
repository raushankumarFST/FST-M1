try:
    print(x)
except NameError:
    print("x hasn't been defined yet.")
finally:
  print("please clean up the code")