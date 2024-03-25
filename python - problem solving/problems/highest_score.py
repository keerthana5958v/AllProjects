scores = input("enter scores-->").split()
print(scores)


high_score = 0

for score in range(0,len(scores)):

    if int(scores[score]) > high_score:
        high_score = int(scores[score])

print(high_score)