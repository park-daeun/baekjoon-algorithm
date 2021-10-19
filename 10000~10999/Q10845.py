import sys
from collections import deque

def push(que, x):
    que.append(x)
    return que

def size(que):
    return len(que)

def empty(que):
    if len(que) == 0:
        return 1
    else:
        return 0

def pop(que):
    if empty(que) == 0:
        return que.popleft()
    else:
        return -1

def front(que):
    if empty(que) == 0:
        num = que.popleft()
        que.appendleft(num)
    else:
        num = -1
    return num

def back(que):
    if empty(que) == 0:
        num = que.pop()
        que.append(num)
    else:
        num = -1
    return num

n = int(sys.stdin.readline())
que = deque()

for i in range(n):
    order = sys.stdin.readline().rstrip()

    if 'push' in order:
        push(que, order[5:])
    elif order == 'pop':
        print(pop(que))
    elif order == 'size':
        print(size(que))
    elif order == 'empty':
        print(empty(que))
    elif order == 'front':
        print(front(que))
    elif order == 'back':
        print(back(que))