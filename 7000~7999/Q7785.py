import sys

n = int(sys.stdin.readline())
employees = dict()

for _ in range(n):
    name, inout = sys.stdin.readline().split()
    
    if name in employees:
        if inout == "leave":
            employees.pop(name)
    
    else:
        if inout == "enter":
            employees[name] = 1

ans = list(employees.keys())
ans.sort(reverse = True)

for a in ans:
    print(a)