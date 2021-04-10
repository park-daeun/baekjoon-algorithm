#!/usr/bin/env python
# coding: utf-8

# In[1]:


import math

t = int(input())

for i in range(0,t):
    x,y = map(int, input().split())
    n = y-x
    num_of_k = 0
    sqrt_n = math.sqrt(n)
    ceil_n = math.ceil(sqrt_n)

    if sqrt_n == ceil_n:
        num_of_k = 2*(ceil_n) - 1
    else:
        if n > (ceil_n-1)**2 + ceil_n-1:
            num_of_k = 2*(ceil_n) - 1
        else:
            num_of_k = 2*(ceil_n) - 2

    print(int(num_of_k))

