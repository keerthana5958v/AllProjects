# How many squares are there on a standard chessboard? (A standard chessboard consists of 8x8 squares.) How to extend this solution in the case of n x n chessboard, n being any positive integer.
a = int(input("enter the number of sides in the chessboard"))
squares = int((a * (a + 1) * (2 * a + 1)) / 6)
print("number of squares in the chess board-->", squares)
rect = int(squares + (a * 2* (a * (a + 1) / 2)))
print("number of squares in the chess board-->", rect)
