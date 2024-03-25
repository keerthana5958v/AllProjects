# Dominique wrote down the 1000-digit number 200820082008...2008.
# She then erased some digits and was surprised to find that the remaining digits added up to 2008.
# What is largest number of digits that she could have erased?

# print(1000/4)

list2008 = "2008"*250
count0 = 0
count2 = 0
count8 = 0
for x in list2008:
    if x == '0':
        count0 +=1
    if x=='2':
        count2+=1
    if x == '8':
        count8+=1
#we dont need zeroes
list2008 = list2008.replace('0','',count0)

# now there are 250 8's and 2's

#we need 4 2s and 250 8's

list2008 = list2008.replace('2','',count2-4)

# digit_sum = 0
# for x in list2008:
#     digit_sum += int(x)
# print(digit_sum)

print('largest number of digits that she could have erased is',(count0 + count2 - 4))
