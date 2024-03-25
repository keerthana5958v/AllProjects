# Write a program to find the GCD of a number?
# from audioop import 
from builtins import range, reversed, print, min


def problem2(num1 , num2):
    for i in reversed(range(1,min(num1,num2))):
        if num2%i ==0 and num1%i ==0:
            return i
print(problem2(51,243))

