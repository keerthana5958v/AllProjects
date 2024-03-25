mat1 = [["-","-","-"],["-","-","-"],["-","-","-"]]

def getInput():
    global row_position 
    row_position = int(input("enter row -->  "))
    global column_position
    column_position = int(input("enter column -->  "))

    global position_validity
    position_validity = row_position>0 and row_position<=3 and column_position>0 and column_position<=3 and mat1[row_position-1][column_position-1]=="-"
    
def checkIfSpaceFree():
    if(mat1[row_position-1][column_position-1]==("X" or "O")):
        print("Oops seems like this place is aldready taken\nYou lost your chance")
         
def printX():
    print("\nplayer X -->")
    getInput()
    if position_validity==True:
        checkIfSpaceFree()
        for a in mat1:
            if a[column_position-1]=="-" and mat1[row_position-1]==a:
                mat1[row_position-1][column_position-1]="X"           
        for m in mat1:
            print(m)
    else:
        print("print valid position\nYou lost your chance")
        
def printO():
    print("\nplayer O -->")
    getInput()
    if(position_validity):
        checkIfSpaceFree()
        for a in mat1:
            if a[column_position-1]=="-" and mat1[row_position-1]==a:
                mat1[row_position-1][column_position-1]="O"
                    
        for n in mat1:
            print(n)
    else:
        print("print valid position\nYou lost your chance")
        


xnotwin = ((mat1[0][0]!="X" and mat1[0][1]!="X" and mat1[0][2]!="X") or (mat1[1][0]!="X" and mat1[1][1]!="X" and mat1[1][2]!="X") or (mat1[2][0]!="X" and mat1[2][1]!="X" and mat1[2][2]!="X"))

ynotwin = ((mat1[0][0]!="O" and mat1[0][1]!="O" and mat1[0][2]!="O") or (mat1[1][0]!="O" and mat1[1][1]!="O" and mat1[1][2]!="O") or (mat1[2][0]!="O" and mat1[2][1]!="O" and mat1[2][2]!="O"))

i=0

for x in range(4):
    if xnotwin and ynotwin:
        printX()
        printO()