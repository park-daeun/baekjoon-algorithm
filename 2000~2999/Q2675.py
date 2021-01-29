#!/usr/bin/env python
# coding: utf-8

# In[1]:


t = int(input())

for _ in range(t):
    r, s = input().split()
    new_s = ''
    for x in s:
        for _ in range(int(r)):
            new_s = new_s + x
    print(new_s)

