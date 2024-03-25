# To find mean, median , mode, geometric mean, harmonic mean.

list_of_values = [12,32,95,25,86,52,25,72,46,29,34]
num_of_items = (len(list_of_values))
def mean():
    mean =  sum(list_of_values) / num_of_items
    mean = round(mean,2)
    return mean

def median():
    list_of_values.sort()
    if (num_of_items%2 == 0):
        middle_term1 = num_of_items //2 
        middle_term2 = ( num_of_items //2 ) + 1
        median = (list_of_values[middle_term1] + list_of_values[middle_term2]) / 2
    else: 
        median = list_of_values[num_of_items//2]
    return median

def mode():
    mode = max(list_of_values, key=list_of_values.count)
    return mode

def GM():
    prod_of_all_val = 1
    for x in list_of_values:
        prod_of_all_val *= x
    gm = prod_of_all_val ** (1/ num_of_items)
    gm = round(gm ,2)
    return gm

def HM():
    reciprocal_sum = 0
    for x in list_of_values:
        reciprocal_sum += 1/x
    hm = num_of_items / reciprocal_sum
    hm = round(hm ,2)
    return hm

print(list_of_values)
print("Mean is: ", mean() )
print("Median is: ", median() )
print("Mode is: ", mode() )
print("Geometric mean  is: ", GM() )
print("Harmonic mean is: ", HM() )


