import sys

n = int(sys.stdin.readlin())
m = int(sys.stdin.readlin())
s = sys.stdin.readlin().rstrip()
i = 0
ans = 0
j = 0

while i < m-2:
    if s[i] == 'I' and s[i+1] == 'O' and s[i+2] == 'I':
        i += 2
        j += 1
        if j == n:
            j -= 1
            ans += 1    
    else:
        i += 1
        j = 0
print(ans)