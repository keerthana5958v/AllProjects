# in two d array find the max array with maximum sum
arr1=[[1,2,3],[4,5,6],[7,8,9]]
a=[]
for arr in arr1:
    a.append(sum(x for x in arr))
print(a)
max=0
for i in range(len(a)):
    if a[i]>max:
        a[i]=max
print(max)