N, K = raw_input().split()
N = int(N)
K = int(K)
costs =  sorted(map(int, raw_input().strip().split(' ')))
result = 0
x = 0
n = N -1
while  n >= 0:
    i = 0
    while n>=0 and i<K:
        c = costs.pop()
        result = result + (x+1)*c
        n-=1
        i+=1

    x += 1

print (result)


