# Consider you have a list of items. Write a program to extract all elements whose frequency is greater than K. Eg: if list=[1,2,1,3,1,4,2,3,4,3,4]. Extract all elements whose frequency is greater than 2.
def remove_frequent_elements():
    list1=[1,2,1,3,1,4,2,3,4,3,4]
    list2 = []
    for x in list1:
        if list1.count(x)>2 and (x not in list2):
            list2.append(x)
    return list2
    

b = remove_frequent_elements()
print("problem2 : ",b, "\n")
