#  Consider you are designing a text formatter in python. Do a left, right and center align 
# with hyphens (-).  
# Left Align -  HelloWorld---------- 
# Center Align - -----HelloWorld---- 
# Right Align -   ----------HelloWorld

string1 = "helloWorld"
width = 8
left_align = string1 + ("-"*width)
center_align = ("-"*(width//2)) + string1 + ("-"*(width//2))
right_align = ("-"*width) + string1


print("left align: "+left_align)
print("center align: "+center_align)
print("right align: "+right_align)

