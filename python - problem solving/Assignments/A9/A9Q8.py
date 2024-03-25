# 8). Consider you have an input string like, "Hi, I am fine. How are you?". Write a python program to find the longest word in this string

GivenString=input("enter a string-->")
splitString=GivenString.split()
maxLenghtOfString=0
for item in splitString:
    if len(item)>maxLenghtOfString:
        maxLenghtOfString=len(item)
print(item)