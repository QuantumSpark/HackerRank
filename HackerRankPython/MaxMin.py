N = input()
K = input()
lists = [input() for _ in range(0,N)]
lists.sort()
def calculate(lists):
    l= list()
    for i in range(N-K+1):
        l.append(lists[i+K-1] - lists[i])
    return min(l)


min_diff = calculate(lists)

print min_diff

