arr1=[1,4,2,3,4,1,0,5]
arr2=[]
count=0
for a in arr1:
    for b in arr1:
        if a+b==5:
            count+=1
            arr2=[a,b]
            print(arr2)
print(count//2)