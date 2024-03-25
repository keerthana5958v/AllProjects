# Consider a positive integer that contains only the digits 3 and 4, with at least one of each 3 as well as 4. The integer is divisible by both 3 and 4.
# What is the smallest such integer?
lst1=[]
lst=[i for i in range(10, 10000)]
for x in lst:
    if x%12==0:
        lst1.append(x)
lst1 = [x for x in lst1 if all(digit not in str(x) for digit in ['1','2', '5', '6', '7', '8', '9','0'])]
print("the smallest number containing only 3 or 4 and divisible by both is: ",lst1[0])