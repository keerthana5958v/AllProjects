word = 'malaalam'
rev_str = ''
for a in reversed(word):
    rev_str = a + rev_str
if rev_str == word:
    print('it is a palindrome')
else:
    print('it is not a palindrome')
