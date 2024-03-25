# starting_range =  493_7775
print('hii')
def generate_primes(UpperLimit):
    prime_num_list = []
    for num in range(2, UpperLimit):
        is_prime = True
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                is_prime = False
                break
        if is_prime:
            prime_num_list.append(num)
    return prime_num_list


def generatePrimeFactorFor(num):
    primeFactorList = []
    primesList = generate_primes(num)
    for x in primesList:
        if num % x == 0:
            primeFactorList.append(x)
    return primeFactorList

def sumOfDigits(num):
    sum = 0
    for x in str(num):
        sum += int(x)
    return sum

# def generatePrimeFactorList(num):
#     primeFactors = []
#     x = 2
#     while num > 1 and num % x == 0:
#         primeFactors.append(x)
#         num = num // x
#         x += 1
    
#     return primeFactors

listOfNum = [x for x in range (493_7775, 500_0000)]
smithNumList = []
for x in listOfNum:
    if sum(generatePrimeFactorFor(x)) == sumOfDigits(x):
        smithNumList.append(x)

print(smithNumList[0])