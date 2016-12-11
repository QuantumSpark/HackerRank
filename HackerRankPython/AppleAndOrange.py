s,t = raw_input().strip().split(' ')
s,t = [int(s),int(t)]
a,b = raw_input().strip().split(' ')
a,b = [int(a),int(b)]
m,n = raw_input().strip().split(' ')
m,n = [int(m),int(n)]
apple = map(int,raw_input().strip().split(' '))
orange = map(int,raw_input().strip().split(' '))


appleCount = 0
for index in apple:
    tmp = a + index
    if tmp >= s and tmp <=t:
        appleCount+=1
    tmp = 0

orangeCount = 0
for index in orange:
    tmp = b + index
    if tmp >= s and tmp <= t:
        orangeCount += 1

    tmp = 0


print appleCount
print orangeCount