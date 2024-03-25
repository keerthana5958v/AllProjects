# Write a program to find the sum of digits of a number.
from builtins import int, str, print


def problem5(num):
    num = str(num)
    sum = 0
    for x in num:
        sum += int(x)
    return sum
print(problem5(2253))