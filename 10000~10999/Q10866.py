from collections import deque
import sys

def push_front(queue, x):
    queue.appendleft(x)
    return queue

def push_back(queue, x):
    queue.append(x)
    return queue

def empty(queue):
    if len(queue) == 0:
        return 1
    else:
        return 0

def pop_front(queue):
    if empty(queue) == 1:
        print(-1)
    else:
        print(queue.popleft())
    return queue

def pop_back(queue):
    if empty(queue) == 1:
        print(-1)
    else:
        print(queue.pop())
    return queue

def size(queue):
    return len(queue)

def front(queue):
    if empty(queue) == 1:
        print(-1)
    else:
        a = queue.popleft()
        print(a)
        queue.appendleft(a)

def back(queue):
    if empty(queue) == 1:
        print(-1)
    else:
        a = queue.pop()
        print(a)
        queue.append(a)

n = int(sys.stdin.readline())

queue = deque()
for _ in range(n):
    order = sys.stdin.readline().rstrip()

    if order == 'pop_front':
        queue = pop_front(queue)
    elif order == 'pop_back':
        queue = pop_back(queue)
    elif order == 'size':
        print(size(queue))
    elif order == 'empty':
        print(empty(queue))
    elif order == 'front':
        front(queue)
    elif order == 'back':
        back(queue)
    elif order[:9] == 'push_back':
        queue = push_back(queue, order[10:])
    elif order[:10] == 'push_front':
        queue = push_front(queue, order[11:])

'''
입력 예시
15
push_back 1
push_front 2
front
back
size
empty
pop_front
pop_back
pop_front
size
empty
pop_back
push_front 3
empty
front

22
front
back
pop_front
pop_back
push_front 1
front
pop_back
push_back 2
back
pop_front
push_front 10
push_front 333
front
back
pop_back
pop_back
push_back 20
push_back 1234
front
back
pop_back
pop_back

출력 예시
2
1
2
0
2
1
-1
0
1
-1
0
3

-1
-1
-1
-1
1
1
2
2
333
10
10
333
20
1234
1234
20
'''