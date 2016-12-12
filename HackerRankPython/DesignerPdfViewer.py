import sys


baseChar = 97

h = map(int,raw_input().strip().split(' '))
word = raw_input().strip()

maxh = -1
for letter in word :
    value = ord(letter) - baseChar
    tmph = h[value]
    if tmph > maxh:
        maxh = tmph


print(maxh * len(word))



