# create a string with the first, middle and last character of a given string.
def problem1(string):
    return string[0] + string[len(string)//2] + string[-1]
print(problem1("hello"))