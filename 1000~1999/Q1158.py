import sys
from collections import deque

N, K = map(int, sys.stdin.readline().split())
people = deque(i+1 for i in range(N))
temp = deque()
ans = []

while len(ans) != N:
    k = K
    while k > len(people):
        k -= len(people)

    #print(people)
    for i in range(k-1):
        temp.append(people.popleft())
    
    ans.append(people.popleft())

    while len(temp) > 0:
        people.append(temp.popleft())

print('<', end='')
print(*ans, sep=', ', end='')
print('>')

'''
입력 예시
7 3

7 6

출력 예시
<3, 6, 2, 7, 5, 1, 4>
<6, 5, 7, 2, 1, 4, 3>
'''