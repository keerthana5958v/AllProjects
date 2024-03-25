# Write a function which when given a non-negative integer n and an arbitrary base b, returns the number reversed in that base.

# Examples
# n=12 and b=2 return 3, because 12 in binary is "1100", which reverses to "0011", equivalent to 3 in decimal.

from builtins import len, list, print, range, reversed, str


def convertToBinary():
    given_number = 13
    print('Given decimal number: ',given_number)
    ans=""
    binary_output=""
    while (given_number > 0):
            digit_value = given_number % 2
            given_number= given_number//2
            ans+= str(digit_value)
        #     binary_output = ans[::-1]      
    return ans
print('binary number: ',convertToBinary())

def BinaryToDecimal():
    bin_num = convertToBinary()
    print("Original binary number:", bin_num)
    bin_num = bin_num[::-1]
    print("Reversed binary number:", bin_num)
    
    # Calculating decimal using positional notation method
    arr = [2 ** n for n in range(len(bin_num))]
    split_of_binary_digits = list(bin_num)
    
    # Removing first zeroes
    while split_of_binary_digits and split_of_binary_digits[0] == '0':
        split_of_binary_digits.pop(0)

    decimal_sum = sum(arr[x] for x in range(len(split_of_binary_digits)) if split_of_binary_digits[x] == '1')

    print("Decimal of reversed binary number: ", decimal_sum)
BinaryToDecimal()