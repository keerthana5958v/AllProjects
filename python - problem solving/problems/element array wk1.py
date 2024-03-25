arr1 = ['3','4','6','1','7','4','9','3','7','2']
arr2=[]
print(str(arr1))
[arr2.append(a) for a in arr1 if a not in arr2]
print(str(arr2))
arr2.sort()
print(str(arr2))

arr2.append((int(arr2[-1]))+1)
print(str(arr2))