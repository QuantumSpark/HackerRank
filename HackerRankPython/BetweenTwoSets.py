import sys
from fractions import gcd


n,m = raw_input().strip().split(' ')
n,m = [int(n),int(m)]
a = map(int,raw_input().strip().split(' '))
b = map(int,raw_input().strip().split(' '))


def lcm(a,b):
   return  (a*b)/gcd(a,b)



def lcmList(list):
    return reduce(lcm, list)

def gcdlist(list):
    return reduce(gcd,list)


valueLCM = lcmList(a)
valueGCD = gcdlist(b)
count = 0
for value in range(0,valueGCD+1,valueLCM):
    if value == 0:
        continue
    if (valueGCD%(value) == 0):
        count= count +1;


print(count)