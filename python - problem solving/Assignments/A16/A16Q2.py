# Given two strings, s1 and s2. Write a program to create a new string s3 made of the first char of s1, then the last char of s2, Next, the second char of s1 and second last char of s2, and so on. Any leftover chars go at the end of the result.

def problem2(str1,str2):
    index1 = 0
    index_last = -1
    final_str = ''
    spilter =''

    if str1 == '':
        final_str = ''.join(reversed(str2))
        return final_str

    if str2 =='':
        return str1

    if (len(str1) > len(str2)) and (str2!=''):
        x = len(str1) - len(str2)
        spilter = str1[-x:]
        # print(spilter)

    if (len(str1) < len(str2) and (str1!='')):
        x = len(str2) - len(str1)
        spilter = str2[-x:]
        # print(spilter)

    while (index1 < len(str1)) and (len(str2) >= -1* index_last ):

        final_str +=  str1[index1] + str2[index_last]
        index1 += 1
        index_last -= 1
    return final_str + spilter


print(problem2('hello', 'heart'))
print(problem2('hello0000000', 'heart'))
print(problem2('', 'heart'))
print(problem2('hello', ''))

