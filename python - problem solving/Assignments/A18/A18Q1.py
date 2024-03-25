# Consider you have a list of items. Write a program for removing all the occurrences of a given item present in the list

arr = [1,2,4,5,2,6,2,5,7,8,3,0]
def num_to_remove(n):
    for x in arr:
        if n==x:
            arr.remove(x)
    return arr

print(num_to_remove(2))