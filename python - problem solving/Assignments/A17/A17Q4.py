# Write a program to search an element in a ascending ordered array using binary search.

def problem4(MyList , value):
    start = 0
    end = len(MyList) - 1
    while start <= end:
        mid_point = (start + end) // 2
        mid_pt_value = MyList[mid_point]
        if mid_pt_value == value:
            return mid_point
        elif value > mid_pt_value:
            start = mid_point
        else:
            end = mid_pt_value
    return None

arr = [9,6,8,7,2,5,11,15,21]
arr.sort()

# print(arr)
print(problem4(arr,8))