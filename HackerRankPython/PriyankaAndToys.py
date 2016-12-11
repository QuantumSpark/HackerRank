
t = int(raw_input().strip())
weight = sorted(map(int, raw_input().split()))
l = list()
for i, item in enumerate(weight):
    tmp = [x for x in range(item, item+4)]
    count = 0
    for j in range(i,len(weight)):
        w = weight[j]
        if w > item + 4:
            break;
        if w in tmp:
            count+=1

    l.append(count)

print max(l)