# 1). Consider, you are writing a password checker program. Your program is supposed to check for a password and say whether it is a strong password or not.
# Conditions to consider for a strong password are:

#     The password length must be atleast 6 characters long
#     It should contain atleast one number.
#     It should contain atleast one lowercase and one uppercase character
#     It should contain atleast one valid special character. valid special characters are: !@#$&

# Sample Input:
# 1). Student1# -> Strong Password
# 2). cine2 -> Weak Password
# 3). SimpleHack126#@ -> Strong Password. 

'''
char=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
char_upper= [x.upper() for x in char]
numbers = ["0","1","2","3","4","5","6","7","8","9"]
special_char = ["!","@","#","$","%","&","*","(",")",">"]

all = char + char_upper + numbers + special_char
count = 0
password = input("enter your password-->")

for x in password:
    if any(x) not in char:
        count += 1
    elif 
        break       
    else:
        print("weak password")
        break
'''

n = input()
special_char = ["!","@","#","$","%","&","*","(",")",">"]
password = list(n)
count = 0
if len(n)>6:
    for i in range(len(password)):
        if ord(password[i]) not in range(97,123):
            count +=1
        elif password[i].isnumeric():
            count += 1
        elif password[i] in special_char:
            count += 1
        
    if count >= 3:
        print('strong')
    else:
        print('weak')
else:
    print('weak')