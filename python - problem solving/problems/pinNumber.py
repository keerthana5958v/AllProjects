# enter saving amount
# enter method
# enter withdrawl or deposit amount
# new balance=
global savingAmount
savingAmount = 3000
pin=4562
def bankprocess():
    global savingAmount
    pinnum=int(input("enter pin"))
    while pinnum==pin:
        x = input("Enter procedure-->\n withdrawl or deposit or exit\n")
        flag=True
        while flag:
            if x== 'withdrawl':
                withdrawlAmount = int(input("enter withdrawl amount--> "))
                if withdrawlAmount > savingAmount:
                    print("<------not enough balance------>")
                else: 
                    savingAmount= savingAmount-withdrawlAmount
                break
            elif x == 'deposit':
                depositAmount = int(input("enter deposit amount-->"))
                savingAmount = savingAmount+depositAmount
                break
            else:
                print("<------enter valid input------>\n <------ run again ------> ")
                flag = False
        print("current balance is-->", savingAmount)
        break
bankprocess()