# 2). Consider, you are a book publishing company. You publish books on Maths Problems. You have "c" chapters in each book and every chapter might contain "n" number of problems . The way you print in a book is, for every page, you have a fixed number of problems "k" to be printed. Every page should contain exactly "k" number of problems, unless, you are printing the last page of a chapter and you have lesser than "k" problems to be printed on that page. Each chapter should start in a fresh page. Can you find out how many pages would be required for printing the problems in the book? 


# output= number of pages

chapters=int(input("enter number of chapters-->"))
totalNoOfproblems=int(input("enter total number of problems in chapter-->"))
problemPerPage=int(input("enter max number of problem per page-->"))

page=0

remainingProblems = totalNoOfproblems % problemPerPage
if remainingProblems>1:
    page+= (problemPerPage*totalNoOfproblems*chapters)+remainingProblems
else:
    page+= (problemPerPage*chapters*totalNoOfproblems)
print("number of pages necessary->",page)