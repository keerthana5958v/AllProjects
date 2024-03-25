list_of_2_digit_num = [x for x in range(10,100)]
list2 = []

def findProductOfDigits(number):
    product = 1
    for digit in str(number):
        product *= int(digit)
    return product

count = 0
for x in list_of_2_digit_num:    
    if findProductOfDigits(findProductOfDigits(findProductOfDigits(x))) % 10 ==0:
        list2.append(x)
        count +=1
print(f'the following list contains {count} numbers that adhere to this pattern\n',list2)


