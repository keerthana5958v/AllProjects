# 9). Consider, you have an input string like, "ABJ8765GHK&456". Write a python program to extract the numbers alone from this string
str1=input("Enter a string : ")
str2=""
for i in range(0,len(str1)):
  if str1[i].isnumeric():
    str2+=str1[i]
print(str2)
    