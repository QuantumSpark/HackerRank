import sys


s = raw_input().strip()
n = long(raw_input().strip())

x = n/len(s)

r = n % len(s)

repeatedA = s.count('a')
finalCount = repeatedA * x

extraWord = s[:r]

finalCount = finalCount + extraWord.count('a')

print finalCount


