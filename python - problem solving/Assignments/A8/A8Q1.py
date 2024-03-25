# 1). Consider, you have an interesting game involving butterflies. You have many butterflies which come in 4 different colors, namely, Yellow, Red, Blue and Green. The butterflies are placed in a straight line and their positions are marked using a String like, "YRB_R_Y". The above string represents the position of the butterflies using the color that they are (Y for Yellow, R for Red, B for Blue and G for Green).
# A butterfly is said to be happy, when she has a same color butterfly adjacent to her (it can be either in the left side/right side). Given a string representing the positions of the butterflies and an index representing a butterfly, find out, whether the butterfly in that position is happy or not.

# Sample Input: String: "YRR_B_Y", index: 2, Output: YES (same color butterfly in her left side.)
# Sample Input: String: "YBR_R_Y", index: 2, Output: NO.

sampleInput=input("enter the order of butterflies-->")
i=0
while i < (len(sampleInput)-1):
    if sampleInput[i] == sampleInput[i+1]:
        print("YES")
        break
    else:
        print("NO")
        break

