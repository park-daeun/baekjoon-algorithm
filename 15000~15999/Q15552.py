#!/usr/bin/env python
# coding: utf-8

# In[3]:


import sys
for i in range(0, int(sys.stdin.readline())):
    a,b = map(int, sys.stdin.readline().split())
    print(a+b)

