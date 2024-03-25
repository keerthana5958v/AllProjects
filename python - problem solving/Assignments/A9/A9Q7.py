# Write a program to find the factors of a given input number
num=int(input("enter a number-->"))

for n in range(1, num):
        if num % n == 0:
            print(n)
        
