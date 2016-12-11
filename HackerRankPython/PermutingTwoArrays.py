

def permuteTwoArrays(a,b,k):
    for i in range(len(a)):
        if ((a[i] + b[i]) < k):
            print "NO"
            return
    print "YES"

if __name__ == '__main__':
    t = int(raw_input().strip())
    for a0 in range(t):
        n,k = raw_input().strip().split(' ')
        n,k= [int(n), int(k)]
        a = sorted(map(int,raw_input().strip().split(' ')))
        b = sorted(map(int,raw_input().strip().split(' ')),key=int, reverse=True)
        permuteTwoArrays(a,b,k);
