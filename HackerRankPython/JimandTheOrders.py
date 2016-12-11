import sys
t = int(raw_input().strip())
l  = list()
for a0 in range(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    tmp = n + k
    l.append(tmp)


for a in range(t):
    m = min(l)
    index = l.index(m)
    print str(index+1)+ " ",
    l[index] = sys.maxint