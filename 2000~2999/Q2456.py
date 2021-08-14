import sys
n = int(sys.stdin.readline())

candidate = [[], [], []]

for i in range(n):
    a, b, c = map(int, sys.stdin.readline().split())
    candidate[0].append(a)
    candidate[1].append(b)
    candidate[2].append(c)

scores = [[1, sum(candidate[0]), candidate[0].count(3), candidate[0].count(2)], [2, sum(candidate[1]), candidate[1].count(3), candidate[1].count(2)], [3, sum(candidate[2]), candidate[2].count(3), candidate[2].count(2)]]

scores.sort(key = lambda x:(-x[1], -x[2], -x[3]))

if scores[0][1:] == scores[1][1:]:
    print(0, scores[0][1])
    quit()

print(scores[0][0], scores[0][1])