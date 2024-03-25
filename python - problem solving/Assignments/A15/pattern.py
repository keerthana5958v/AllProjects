def pattern1():
    n=5
    for y in range(n):
        for z in range(n):
            if y==0 or y==n-1 or z==0 or z==n-1:
                print("*",end="")
            else:
                print(" ",end="")
        print()


def pattern2():
    n = 5
    for i in range(n):
        print("*"*i)
    print()

def pattern3():
    n = 5
    for x in reversed(range(n)):
        print("*"*x)
    print()

def pattern4():
    n = 5
    a = -1
    b = 5
    for p in range(n):
        for q in range(n):
            if p==0 or a==q or b==q:
                print("*",end="")
            else:
                print(" ",end="")
        print()
        if a==b: break
        a+=1
        b-=1
    print()
    


def pattern5():
    n = 5
    a = 0
    b = 5
    for i in range(n):
        c=0
        for j in range(n):
            if j>a-1:
                print("*",end="")
                c+=1
                if b==c: break
            else: print(" ",end="")    
        print()
        print()
        if i>(n/2)-1: 
            a-=1
            b+=2
        else: 
            a+=1
            b-=2
    print()

pattern1()
pattern2()
pattern3()
pattern4()
pattern5()