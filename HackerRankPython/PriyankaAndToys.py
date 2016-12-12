t = int(raw_input().strip())
weights = sorted(map(int, raw_input().strip().split(' ')))

startBuying = weights[0]
totalAmount = 1
for wprime in weights:
    if wprime > startBuying + 4:
        startBuying = wprime
        totalAmount += 1
print totalAmount

# If this if-statement is skipped, then that that means
# the toy is within [wprime, wprime+4]