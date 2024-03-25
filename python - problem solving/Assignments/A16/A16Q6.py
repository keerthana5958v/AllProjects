# Triangular numbers are so called because of the equilateral triangular shape that they occupy when laid out as dots.
# For negative numbers, let the stars be 0

def problem6(n):
    if n < 0:
        print(0)
    else:
        for x in reversed(range(1,n+1)):
            print (x*'*')
        print()

problem6(6)
problem6(-10)