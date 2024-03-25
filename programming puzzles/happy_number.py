# 100 -> 1^2 + 0^2 + 0^2 = 1
# 100 is a happy number.

# Iteration of 10572550:
# 10572550 → 1^2+0^2+5^2+7^2+2^2+5^2+5^2+0^2=129
# 129 → 1^2+2^2+9^2=86
# 86 → 8^2+6^2= 100
# 100 → 1^2+0^2+0^2 =1
# As this iteration is ending in 1, the number 10572550 is a happy number.

def sq_sum_digit(n):
    sum_of_sq = 0
    for x in str(n):
        sum_of_sq += (int(x)**2)
    return sum_of_sq

n = 10572550
# a = happy_number(happy_number(happy_number(happy_number(happy_number(n)))))

def repeating_sum_sq(num , times):
    for x in range(times):
        num = sq_sum_digit(num)
    return num

a = (repeating_sum_sq(n , 5))
if a == 1:
    print(n, 'is a happy number\t:)')
else:
    print(n,'is not happy\t:(')