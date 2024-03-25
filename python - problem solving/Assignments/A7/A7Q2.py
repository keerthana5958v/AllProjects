# 2). Consider you have a String like this: oneTwoThree. The notation you see here is called "Camel Case". That is, the first word will start with a lowercase alphabet and the next words' starting letters will be given as Uppercase alphabets. (Note: There wont be a space to separate the words) Examples of some camelcase words: employeeCount, powerVariable, multiplicationFactor, reducedStringCount.

# Your task in this program is to get a camelcase string as input and split it into separate words based on case of the words and return the total number of words available in the string.
# Eg: Sample Input: employeeCount
# Output: 2
# Input: reducedStringCount
# Output: 3

count=1
SampleInput=input("enter sample input-->")
for a in SampleInput:
    if a==a.upper():
        count=count+1
print(count)