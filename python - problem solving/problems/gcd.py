num1 = 54
num2 = 36
lst=[]
for i in range(1,max(num1,num2)):
    if num2%i ==0 and num1%i ==0:
        lst.append(i)
print(lst[-1])
