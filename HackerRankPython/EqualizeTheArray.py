n = long(raw_input().strip())
A = sorted(map(int,  raw_input().strip().split(' ')))

setA = set(A)
l = list()
for c in setA:
    l.append(A.count(c))

l.remove(max(l))
print sum(l)