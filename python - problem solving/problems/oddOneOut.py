# to find the odd one out in each sub list

arr = [[1,2,6],[1,3,9,12],[1,4,16,8],[1,5,25,35]]
newarr=[]
# for x in arr:
#     x.remove(x[-1])
#     # print(x)
#     newarr.append(x)
# print(newarr)

# for y in arr:
#     if eval(arr[0]) * eval(arr[1]) != eval(arr[2]):
#         arr.remove(2)
# print(arr)

for a in arr:
    for j in range(0,len(a)-1):
        b= 0
        if a[j] == a[j]**b:
            a.pop()
            b+=1
print([x for x in arr])




