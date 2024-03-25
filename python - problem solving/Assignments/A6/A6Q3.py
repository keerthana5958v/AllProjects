# 3). Consider an input number n, return the number of positive odd numbers below n.
n=int(input("Enter Number--> "))
count=0 
for i in range(n+1):
  if i % 2 != 0:
    count+= 1
print(count)