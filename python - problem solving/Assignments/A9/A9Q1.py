# 1). Write a program that accepts 10 numbers as Input. You can either get it as comma separated values and split them to form an array or you can use 10 variables. Either way is fine. Once you get the input, find out the average of those 10 numbers, round it to 2 decimal places and print the result.

numbers=input("enter 10 numbers with comma-->")
numb=numbers.split(",")

sum=0
for i in range(len(numb)):
        sum += int(numb[i])
average = round(sum/len(numb))
