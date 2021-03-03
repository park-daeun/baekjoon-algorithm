#!/usr/bin/env python
# coding: utf-8

# In[3]:


n,x = map(int, input().split())
a = input().split()
for i in a:
    if int(i) < x:
        print(i, end=' ')

