# Your task in this kata is to implement a function that calculates the sum of the integers inside a string. For example, in the string "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog", the sum of the integers is 3635
strr = "The30quick20brown10f0x1203jumps914ov3r1349the102l4zy dog"
def sum_from_string(string):
    num = 0
    sum = 0
    for x in string:
        if x.isdigit():
            num = num * 10 + int(x)
        else:
            sum += num
            num = 0
    sum += num
    return sum

print(sum_from_string(strr))
