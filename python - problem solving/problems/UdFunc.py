a = [[1,2,3],[2,3,4],[6,4,8]]
b = [[4,2,1],[6,4,3],[4,8,2]]
# print(list(map(lambda a,b:a*b,a,b)))
# for item in a:
#     print(list[(map(lambda a,b:a*b,a,b)), for element in b])

result = []
for row_a, row_b in zip(a, b):
    result_row = [x*y for x,y in zip(row_a,row_b)]
    result.append(result_row)

for row in result:
    print(row)
