# Write a program to find all occurrences of a substring in a given string ignoring the case.

def problem4(str1):
    str1 = str1.lower()
    str2 = 'hi'
    return [i for i in range(len(str1)) if str1.startswith(str2, i)]

print(problem4("FCWFsdbshiestcehiyrtvhrcujer6by5sv5cxehi"))


