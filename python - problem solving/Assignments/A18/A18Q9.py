# Make a program that filters a list of strings and returns a list with only your friends name in it.

# If a name has exactly 4 letters in it, you can be sure that it has to be a friend of yours! Otherwise, you can be sure he's not...

# Ex: Input = ["Ryan", "Kieran", "Jason", "Yous"], Output = ["Ryan", "Yous"]

def myFriends(allFriends):
    onlyMyFriends = []
    for x in allFriends:
        if len(x)==4:
            onlyMyFriends.append(x)
    return onlyMyFriends
print(myFriends(["Ryan", "Kieran", "Jason", "Yous"]))