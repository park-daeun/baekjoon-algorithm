import sys

cards = [i+1 for i in range(20)]

for i in range(10):
    a, b = map(int, sys.stdin.readline().split())

    temp = list(cards[:a-1])

    temp.extend(list(reversed(cards[a-1:b])))
    temp.extend(list(cards[b:]))

    cards = temp

print(*cards, sep=' ')

'''
입력 예시
5 10
9 13
1 2
3 4
5 6
1 2
3 4
5 6
1 20
1 20

1 1
2 2
3 3
4 4
5 5
6 6
7 7
8 8
9 9
10 10

1 20
2 19
3 18
4 17
5 16
6 15
7 14
8 13
9 12
10 11

출력 예시
1 2 3 4 10 9 8 7 13 12 11 5 6 14 15 16 17 18 19 20

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

20 2 18 4 16 6 14 8 12 10 11 9 13 7 15 5 17 3 19 1
'''