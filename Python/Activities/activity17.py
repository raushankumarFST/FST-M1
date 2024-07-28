import pandas

data = {
  "Usernames": ["admin", "user1", "user2"],
  "Passwords": ["password", "test1", "Test2"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

dataframe.to_csv("test.csv", index=False)