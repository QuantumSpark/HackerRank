import sys


a,b,c,d,e = raw_input().strip().split(' ')
l = [int(a),int(b),int(c),int(d),int(e)]
l.sort()
minL = l[:len(l)-1]+l[len(l):]
minNum = sum(i for i in minL)

l=l[::-1]
maxL = l[:len(l)-1]+l[len(l):]
maxNum = sum(i for i in maxL)


print str(minNum) + " " + str(maxNum)

