# f(2n^2) = divisiors of 2n^2 and divisor < n

def f(n):
    divisor_list = []
    for x in range(1,(2* n * n)):
        if ((2*n*n) % x == 0) and (x <= n):
            divisor_list.append(x)
    return divisor_list

print(f(15))