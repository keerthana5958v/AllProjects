# Consider you get the year as an input in your program. Check if the given input year is a leap year or not. - Clue: A leap year should be divisible by 4 or 400(if its a century year). 

year=input("Enter Year --> ")
if int(year)%4==0:
  print("YES")
else:
  print("NO")