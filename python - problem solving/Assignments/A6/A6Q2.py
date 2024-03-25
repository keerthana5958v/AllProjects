# 2). Consider you have two input strings. Check whether the second string is a subset of the first string. 
a=input("string-->")
b=input("sub-string-->")
for i in b:
    if i not in a:
        print("not a subset")
        break
else:
    print("is a subset")
    