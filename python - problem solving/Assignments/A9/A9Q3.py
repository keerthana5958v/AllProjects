# 3). Write a program that takes in 3 decimal numbers as input. Converts all three of them to binary and adds them, as if they are decimal and then, converts the result back to binary and prints the result.
# Example: Input: 8, 9, 10 -> output: 101111000011. (Explanation: 8's binary value is 1000, 9's binary value is 1001, 10's binary value is 1010. Add all three, as if they are decimals 1000+1001+1010 = 3011. Now, convert 3011 to binary. You get the desired output). 

values=input("enter 3 values-->")
num=values.split(",")
int_list=[int(n) for n in num]
binary_list=[bin(x)[2:] for x in int_list]
# print(int_list)
print("the binary values of the numbers are-->",binary_list)
# add elements inside binary_list
int_list2=[int(b) for b in binary_list]
sumOfNumbers=sum(a for a in int_list2)

print("binary value of sum of numbers",bin(sumOfNumbers)[2:])

