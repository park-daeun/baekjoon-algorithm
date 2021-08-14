import sys
n = int(sys.stdin.readline())

for i in range(n):
    a, b = sys.stdin.readline().split()
    if sorted(a) == sorted(b):
        print(a, '&', b, 'are anagrams.')
    else:
        print(a, '&', b, 'are NOT anagrams.')