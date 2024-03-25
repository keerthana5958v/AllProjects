import random

# declaring all charecters
char=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
char_upper= [x.upper() for x in char]
numbers = ["0","1","2","3","4","5","6","7","8","9"]
special_char = ["!","@","#","$","%","&","*","(",")",">"]

# getting the number of charecters
n_char = int(input("enter the number of lower case-->\n"))
n_char_upper = int(input("enter the number of upper case-->\n"))
n_numbers = int(input("enter the number of numbers-->\n"))
n_spec_char = int(input("enter the number of special charecters-->\n"))

# shuffle individual type of charecters
r_char  =  random.choices(char, k=n_char)
r_char_upper  =  random.choices(char_upper, k=n_char_upper)
r_numbers  =  random.choices(numbers, k=n_numbers)
r_spec_char  =  random.choices(special_char, k=n_spec_char)

pass_char =  r_char  +  r_char_upper  +  r_numbers +  r_spec_char
print(random.shuffle(pass_char))
password = ''.join(pass_char)
print("your password is-->"+password)


