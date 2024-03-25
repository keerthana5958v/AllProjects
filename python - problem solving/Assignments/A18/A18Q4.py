# Consider you have a list of items. Check whether three elements appear consecutively in the list. 
# Eg: [1,2,3,3,3,4,5] -> Returns True since, the element 3 comes three times consecutively in the list. 

def consecutive_numbers(lst):
    for x in range(len(lst)-3):
        if lst[x] == lst[x+1] and lst[x] == lst[x+2]:
            return True
    return False

print(consecutive_numbers([1,2,3,3,3,4,5]))
print(consecutive_numbers([1,2,3,3,4,4,5]))