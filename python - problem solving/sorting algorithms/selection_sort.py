lst = [14,33,26,22,46,89,43,28,71,9,4,7,3,67,52,6,34,7,4,8,4,6,4,3,895,63,58,2,48,2,8,2,8,26,8,36,48,136,4]
alst = ['fda','gecg','vdr','savgrv','h','gswgerc']

def selection_sort(lst):
    i = 0
    for x in range(len(lst)):
        for y in range(len(lst)):
            i+=1
            if lst[x] < lst[y]:
                lst[x], lst[y] = lst[y] , lst[x]
    return lst , "no of iterations:" , i

print(selection_sort(alst))


