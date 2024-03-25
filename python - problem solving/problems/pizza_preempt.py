
print(input("hey big question for you!\n press any key to continue"))
print("should you eat the last slice?\n")
print(input("press any key to continue"))
q1=input("did you buy the pizaa? yes or no! \n")


print(q1)
if q1 == "yes":
    print("EAT IT!!!")
elif q1=="no":
    q2=input("did you buy pizza last time? yes or no! \n")
    if q2=="yes":
        print("EAT IT!!!")
    elif q2=="no":
        q3=input("do you care about what other people think? yes or no! \n")
        if q3=="no":
            print("EAT IT!!!")
        elif q3=="yes":
            q4=input("have you had <= 2 slices? yes or no! \n")
            if q4=="yes":
                print("EAT IT!!!")
            elif q4=="no":
                q5=input("did you ask? yes or no!\n")
                if q5=="no":
                    print(q3)
                elif q5=="yes":
                    q6=input("does anyone else want it? yes or no!")
                    if q6=="no":
                        print("EAT IT!!!")
                    elif q6=="yes":
                        print(q3)
else:
    print("run again with a proper input young man!")