# 6). Given an input n, find out how many prime numbers are there between 1 and n. Print all of them.
n=int(input("enter a number-->"))

for num in range(1, n):
    for i in range(2, num):
        if num % i == 0:
            break
        else:
            print(num)
            break