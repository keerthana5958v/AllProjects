# 4). Consider an input string "a1b2c2d3". Based on the number provided after each alphabet, repeat the alphabet as many times and show as an output.
# Example: "a1b2c2d3" -> Output: abbccddd
# "g2e1a2r3" -> Output: ggeaarrr
a={}
b=input("Enter-->")
for i in range(0,len(b)):
    if b[i].isalpha():
        a[b[i]]=b[i+1]   
for i in a.items():
    print(i[0] * int(i[1]), end = '') 
print()