# Consider you get the total percentage secured by a student as input. If the percentage is less than 50, the student gets a Grade F. If it is between 50-60, they get a grade D, If it is between 60-75, they get a grade C. If it is between 75-90, they get a grade B, If it is greater than 90, they get a grade A. Print the grade the student gets. 

m=int(input())
if m<=50:
    print("F")
elif m<=60:
    print("D")
elif m<=75:
    print("C")
elif m<=90:
    print("B")
elif m<=100:
    print("A")
else:
    print("invalid")