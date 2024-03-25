# the array is a odd numbered array like, [67, 93, 100, -16, 65, 97, 92], You should get the output like:
arr=[67, 93, 100, -16, 65, 97, 92]
arr.sort(reverse=1)
arr=list(map(str,arr))
oddarr = arr[::2]
evenarr= arr[1::2]
for x in range(len(oddarr)-1):
    print("  "*x+oddarr[x]+"  "*(len(arr)-(2*x+2))+evenarr[x])
x+=1
if len(arr)%2 == 0:
    print(" "*(x+len(arr)//2)+oddarr[x]+"\n"+" "*(x+len(arr)//2)+evenarr[x])
else:
    print("  "*x+oddarr[x])