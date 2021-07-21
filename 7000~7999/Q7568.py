import sys

n = int(sys.stdin.readline())
x = [0 for _ in range(n)]
y = [0 for _ in range(n)]
scores = [1 for _ in range(n)]

for i in range(n):
    x[i], y[i] = map(int, sys.stdin.readline().split())

for j in range(n):
    for k in range(n):
        if x[j] < x[k] and y[j] < y[k]:
            scores[j] += 1

for score in scores:
    print(score, end=' ')

'''
입력 예시
5
55 185
58 183
88 186
60 175
46 155

출력 예시
2 2 1 2 5

코드 리뷰
x와 y를 리스트로 받아서 사용하였다.
x[1], y[1]를 x[2], y[2]/ x[3], y[3] ... 와 비교하고 x[2], y[2]도 본인을 제외한 나머지 사람들의 덩치와 비교하고...
하는 방식으로 모든 사람의 덩치를 비교하였다.
등수도 리스트로 만들어서 본인보다 덩치가 큰 사람이 있다면 +1 하는 방식으로 갱신하였다.
'''
