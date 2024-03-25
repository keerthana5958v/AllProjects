# 4). Write a program to find out whether a given number is a perfect number or not (Perfect number is one, which is equal to the sum of its divisors. Example: 6 is a perfect number. Because, 1, 2 and 3 are divisors of 6 and adding 1+2+3 = 6. )

n=int(input("enter number-->"))
factors=[]
for x in range(1,n):
    if n%x==0:
        factors.append(x)
print(factors)
sumOfFactors=sum(i for i in factors)
if sumOfFactors==n:
    print("perfect number!!!")
else:
    print("not a perfect number!!!")