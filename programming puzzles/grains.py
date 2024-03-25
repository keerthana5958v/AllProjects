# Write a program to calculate the number of grains that you need to cover n squares (1 <= n <= 64) following this pattern
# a=2**64
# print(a)
sum=1
val=1
num=int(input())
for i in range(1,num):
    val+=val
    sum+=val
print(sum)