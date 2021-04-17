import sys
l = []

for i in range(0, 5):
    a = int(sys.stdin.readline())
    if a < 40:
        a = 40
    l.append(a)

print(sum(l)//5)
