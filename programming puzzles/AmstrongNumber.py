
def isAmstrongNumber(num):
    num_str = str(num)
    sum_of_square_of_digit = 0
    for digit in num_str:
        sum_of_square_of_digit += int(digit)**len(num_str)
    if sum_of_square_of_digit == num:
        return 'is an amstrong number'
    else:
        return 'is not an amstrong number'


print('153',isAmstrongNumber(153))
print('1634',isAmstrongNumber(1634))
print('1423',isAmstrongNumber(1423))
print('156',isAmstrongNumber(156))