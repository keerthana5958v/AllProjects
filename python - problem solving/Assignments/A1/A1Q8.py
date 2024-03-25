# Consider you get a number as input in your program. Check if the number is divisible by 5 or 3 or both and print a message.
# (Refer the modulo operator: The modulo operator is used to get the remainder of a division. If a is divided by b, the ‘/‘ operator provides the quotient of the division, whereas, the % operator provides the remainder of the division.

n=int(input("Enter num --> "))

if n%5==0 and n%3==0:
    print("Divisible by 5 and 3")
if n%3==0:
    print("Divisible by 3")
if n%5==0:
    print("Divisible by 5")
else:
    print("Not divisible by 5 or 3")