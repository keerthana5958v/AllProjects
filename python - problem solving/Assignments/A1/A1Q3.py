# Consider you get a number as an input in your program. Check if the number is positive or negative. 

n=int(input("enter number"))
if n<0:
    print("negative")
elif n==0:
    print("number is zero")
else:
    print("positive")