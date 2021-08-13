import sys
from collections import deque

n = int(sys.stdin.readline())
cards = deque([i+1 for i in range(n)])

while len(cards) != 1:
    print(deque.popleft(cards), end=' ')
    c = deque.popleft(cards)
    cards.append(c)

print(deque.popleft(cards))

'''
입력 예시
4

7

출력 예시
1 3 2 4

1 3 5 7 4 2 6
'''