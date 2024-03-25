lst = []
for i in range(1,650):
    has_no_9 = True
    temp = str(i)
    for j in temp:
        if int(j)==9:
            has_no_9 = False
    if has_no_9:
        lst.append(temp)
print(lst[500])