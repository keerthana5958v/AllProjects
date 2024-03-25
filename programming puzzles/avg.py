# How many 3-digit numbers satisfy the property that the digit in the middle is the average of the first and the third digit

# my logic--> they are consecutive numbers or alternating even/odd numbers 
count=0
for a in range(1,10):
    for c in range(0,10):
        b=(a+c)/2
        if b.is_integer() and b>=1:
            count+=1
print("-->",count)            
