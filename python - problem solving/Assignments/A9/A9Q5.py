# 5). Write a program to print the following pattern:

# 0
# 1 2
# 2 3 4
# 3 4 5 6
# 4 5 6 7 8 
x=int(input('enter a number-->'))
for i in range(x):
    for j in range(i+1):
        print(i, end=" ")
        i += 1
    print()