
a,b,c = raw_input().strip().split(' ')
a = int(a)
b = int(b)
c = int(c)
count = 0
for index in range(a,b+1):
   strNum = str(index)[::-1]
   revNum = int(strNum)
   value = abs(index-revNum) % c
   if value == 0 :
       count+=1

print count