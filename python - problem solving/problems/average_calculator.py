# calculate average
values = input("enter values with space").split()
print(values)
lenght =(len(values))
count=0
for n in range(0,(lenght)):
    count+=int(values[n])
print(count/3)
