# 1). Consider you have a string like "aabcb". Reduce this string such that, the letters that are in pairs are removed.
# For Example: Input String: aabcb, output: c
# Input String: aabab, output: a (two a's that form a pair should be removed and the third 'a' should be retained.)
string=input("enter string--> ")
for i in string:
    if string.count(i)==1:
        print(i)