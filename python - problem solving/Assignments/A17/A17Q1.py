# Print a list in reverse order.

from builtins import len, reversed, range, print


def problem1():
    arr = ['apple','orange','banana','grape','mango','cherry']
    arr2 = []
    for x in reversed(range(len(arr))):
        arr2.append(arr[x])
    print("original: ",arr)
    print('reversed: ',arr2)
problem1()
print()