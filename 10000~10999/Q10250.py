#!/usr/bin/env python
# coding: utf-8

# In[2]:


t = int(input())

for _ in range(t):
    h,w,n = map(int,input().split())
    i = 1
    while 1:
        if n - h*i <= 0:
            break
        i += 1
    print('%d'%(n - h*(i-1)) + '%0.2d' %i)

