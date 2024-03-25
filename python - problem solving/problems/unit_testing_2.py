range1 = input("enter starting range : ")
range2 = input("enter ending range : ")
numb_list = [] 

def divisible_by_5(num1,num2):
    
    for num in range(int(range1),int(range2)):
        if num%5==0:
            numb_list.append(num)
    print(numb_list)
    
try: 
    divisible_by_5(int(range1),int(range2))
except:
    print("not possible to print divisible numbers")
