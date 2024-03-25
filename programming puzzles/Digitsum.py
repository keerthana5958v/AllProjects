# Can you find out how many three digit numbers are there such that the digit in the unit's place is the sum of the other two digits?
# For example, 448. The digit in the unit's place is 8, which is the sum of the first two digits 4 and 4.


def digitSum(n):
    try:
        n = int(n)
        n = str(n)
        if (len(n)==3) and (int(n[-1]) == ((int(n[0]) +  int(n[1])))):
            return True
        else:
            return False
    except:
        return False
    
def numOf3DigitNumbers():
    listOfNum = []
    for x in range(100, 1_000):
        if(digitSum(x)):
            listOfNum.append(x)
    return listOfNum

print("the numbers are: ",numOf3DigitNumbers(), "\nthe number of such 3 digit numbers are: ", len(numOf3DigitNumbers()))

