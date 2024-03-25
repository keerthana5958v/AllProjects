# Find the average of three marks of a couple of students and you need to accept a 
# user input of a student's name and for the given input name, calculate the average of the 
# three marks of a student and print.

name = input("enter name")
marks = input("enter marks with sapce")
x = marks.split()
if len(x) != 3:
    print("--enter 3 marks---")
else:
    sum=0
    for item in x:
        if isinstance(int(item), int):
            sum += int(item)
print("the average is: ",sum/3)