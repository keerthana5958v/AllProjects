# Kevin is noticing his space run out! Write a function that removes the spaces from the values and returns an array showing the space decreasing.
# For example, running this function on the array ['i', 'have','no','space'] would produce ['i','ihave','ihaveno','ihavenospace']
def spaceRemover(myList):
    for x in range(1,len(myList)):
        myList[x] = myList[x-1]+ myList[x]
    print(myList)
spaceRemover(['i', 'have','no','space'])
spaceRemover(['i', 'have','no','space','inside','cannot','handle','more'])
