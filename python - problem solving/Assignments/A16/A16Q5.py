# Consider you have a string. Fetch those substrings/words that have a number attached to them at the end
def problem5(str1):
    str1 = str1.split(" ")
    arr =[]
    for x in str1:
        if x[-1].isdigit():
            arr.append(x)
    return arr
print(problem5('fwa4vct erscg rgecg546v gre4 ge101 ew'))
