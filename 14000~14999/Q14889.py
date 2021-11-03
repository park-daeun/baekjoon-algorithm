import sys
from itertools import combinations

n = int(sys.stdin.readline())
table = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

combi = list(combinations(range(0, n), n//2))
ans = int(1e9)

for i in range(len(combi) // 2):
    start = combi[i]
    link = combi[-i - 1]

    #print(start, link)

    # start
    start_point = 0
    for c in list(combinations(start, 2)):
        start_point += table[c[0]][c[1]] + table[c[1]][c[0]]
    
    # link
    link_point = 0
    for c in list(combinations(link, 2)):
        link_point += table[c[0]][c[1]] + table[c[1]][c[0]]
    
    ans = min(ans, abs(start_point - link_point))

print(ans)

'''
입력 예시 / 출력 예시
4
0 1 2 3
4 0 5 6
7 1 0 2
3 4 5 0
/
0

6
0 1 2 3 4 5
1 0 2 3 4 5
1 2 0 3 4 5
1 2 3 0 4 5
1 2 3 4 0 5
1 2 3 4 5 0
/
2

8
0 5 4 5 4 5 4 5
4 0 5 1 2 3 4 5
9 8 0 1 2 3 1 2
9 9 9 0 9 9 9 9
1 1 1 1 0 1 1 1
8 7 6 5 4 0 3 2
9 1 9 1 9 1 0 9
6 5 4 3 2 1 9 0
/
1

20
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
0 5 4 5 4 5 4 5 0 5 4 5 4 5 4 5 0 5 4 5
'''