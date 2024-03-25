for i in range(1,1716):
    if 1716 % i == 0:
        temp = 1716 // i
        if temp == (i+1)*(i+2):
            print("younger sister age :",i,"\nmiddle sister age :", i+1,"\nelder sister age :",i+2)
