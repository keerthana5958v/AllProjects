def convertToBinary():
    given_number= int(input("enter number to convert into binary"))
    ans=""
    binary_output=""
    for x in range(8):
            digit_value = given_number%2
            given_number= given_number//2
            ans+= str(digit_value)
            binary_output = ans[::-1]      
    print(binary_output)

def convertToOctal():
    given_number = int(input("enter number to convert into octal"))
    ans =""
    octal_output=""
    for x in range(8):
        digit_value = given_number%8
        given_number= given_number//8
        ans+= str(digit_value)
        octal_output = ans[::-1]      
    print(octal_output)

def convertToHex():
    given_number = int(input("enter number to convert into octal"))
    ans =""
    hex_output=""
    for x in range(8):
        digit_value = given_number%16
        if digit_value==10:
            digit_value= str("a")
        elif digit_value==11:
            digit_value= str("b")
        elif digit_value==12:
            digit_value= str("c")
        elif digit_value==13:
            digit_value= str("d")  
        elif digit_value==14:
            digit_value= str("e")
        elif digit_value==15:
            digit_value= str("f")  
        given_number= given_number//16
        ans+= str(digit_value)
        hex_output = ans[::-1]      
    print(hex_output)

def UserChoice():
    inp = input("select any one\n1. binary\n2. hex\n3. octal")
    if inp=="binary" or "1":
        convertToBinary()
    elif inp=="hex" or "2":
        convertToHex()
    elif inp=="octal" or "3":
        convertToOctal()
    else:
        print("enter valid input")
UserChoice()