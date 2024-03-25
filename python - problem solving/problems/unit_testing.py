
def print_prime_number_within_range(num1,num2):
    if num1<0 or num2<0:
        print("no negative prime numbers available")
    else:
        lst = [ x for x in range(int(num1),int(num2))]
        for i in range(num1,int(num2)):
            for j in range(2,i):
                if i%j==0:
                    if i in lst:
                        lst.remove(i)
        print(lst)
    print("execution done")
print_prime_number_within_range(100,1000)