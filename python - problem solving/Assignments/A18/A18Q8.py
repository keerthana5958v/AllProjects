# Create a function that checks if the first argument n is divisible by all other arguments (return true if no other arguments)
def divisiblityByArgs(n , *divisors):
    if not divisors:
        return True
    for x in divisors:
        if x==0:
            return False
        if n%x != 0:
            return False
    return True

print(divisiblityByArgs(10))
print(divisiblityByArgs(10,2))
print(divisiblityByArgs(10,4,2))