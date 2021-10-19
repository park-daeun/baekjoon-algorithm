import sys

while True:
    num = sys.stdin.readline().rstrip()

    if num == "0":
        break
    
    t = 0
    for i in range(len(num) // 2):
        if num[i] != num[-i-1]:
            t = 1
    
    if t == 1:
        print("no")
    else:
        print("yes")