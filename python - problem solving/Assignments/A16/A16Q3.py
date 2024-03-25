# Calculate the sum and average of the digits present in a string eg: ghfh6.5hk7mbm8
def problem3(str1):
    str2 = ''.join(x for x in str1 if x.isdigit())
    sum = 0
    for x in str2:
        x = int(x)
        sum = sum + x
    avg = sum / len(str2)
    avg = round(avg,2)
    print('sum: ',sum)
    print('average: ',avg)
    print()

problem3('5hk7mbm8')
problem3('5hfdh 21 4')
problem3('5h. . bm8')