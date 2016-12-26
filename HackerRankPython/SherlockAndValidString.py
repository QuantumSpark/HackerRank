from collections import Counter

inputString = str(raw_input().strip())

success = False
if len(set(Counter(inputString).values())) is 1:
        success = True
elif len(set(Counter(inputString).values())) is 2:
    for x in  Counter(Counter(inputString).values()).items():
         if x[1] == 1:
            success = True


if success:
    print "YES"
else:
    print "NO"









