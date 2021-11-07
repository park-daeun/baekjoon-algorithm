import sys

n, m = map(int, sys.stdin.readline().split())
group = dict()
member = dict()

for _ in range(n):
    team = sys.stdin.readline().rstrip()
    num = int(sys.stdin.readline())
    
    group[team] = []

    for _ in range(num):
        name = sys.stdin.readline().rstrip()

        member[name] = team
        
        li = group.get(team)
        li.append(name)

        group[team] = li

for _ in range(m):
    quiz = sys.stdin.readline().rstrip()
    i = int(sys.stdin.readline())

    if i == 1:
        print(member.get(quiz))
    else:
        li = group.get(quiz)
        li.sort()
        for ans in li:
            print(ans)