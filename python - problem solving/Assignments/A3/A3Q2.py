# Consider you have an input String. Can you reverse the words alone (not the letters) in the given string? 
#       Eg: Input : "I am coding in Python" => Output: "Python in coding am I"
string = input("Enter String--> ")
l = string.split()
l.reverse()
[print(i, end = " ") for i in l]
print()