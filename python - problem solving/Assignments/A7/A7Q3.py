# 3). There is a strange Counter that works this way. Initially, for the first second, it starts with 3 and keeps decrementing for every second by 1 until it reaches 1. Once it reaches 1, it doubles its value to the prior starting value and keeps decrementing for every second. 

counter=3
time=int(input("enter time--> "))
for t in reversed(range(time)):
    counter-=1
    if counter==0:
        counter=2*time
print("the time and counter-time are-->",time,counter)
