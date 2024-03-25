#  Consider you have a list of items. Check whether the items present in the list are within a range, say, eg: if the items in the list are between 8 to 15 in a list like lst = [8,10,12,11,9,15]

def range_of_list():
    lst = [8,10,12,11,9,15]
    lst.sort()
    min_value = lst[0]
    max_value = lst[-1]
    print(f"range of list is between {min_value} and {max_value}")
range_of_list()