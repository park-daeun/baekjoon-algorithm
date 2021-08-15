import sys
from bisect import bisect_left, bisect_right

n = int(sys.stdin.readline())
cards = list(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
find = list(map(int, sys.stdin.readline().split()))

cards.sort()
for i in find:
    first = bisect_left(cards, i)
    last = bisect_right(cards, i)
    print(last - first, end = ' ')

'''
입력 예시
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

10
1 1 1 1 1 1 1 1 1 1
5
1 2 3 4 5

출력 예시
3 0 0 1 2 0 0 2

10 0 0 0 0
'''