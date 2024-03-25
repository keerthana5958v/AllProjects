# Consider you have an input String. Now, get an index value as input and remove the character that is available in that index. 
str1 = input("Enter String--> ")
n = int(input("Enter Number--> "))
if n <= len(str1):
    string = ''
    for i in range(len(str1)):
        if i + 1 != n:
            string += str1[i]
    print(string)
else:
    print("Enter a valid Number for Index!!!")