#!/usr/bin/env python
# coding: utf-8

# In[1]:


A,B,C = map(int, input().split())

if B < C:
    x = A // (C-B)
    print(x+1)
    
else:
    print(-1)

