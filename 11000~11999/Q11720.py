#!/usr/bin/env python
# coding: utf-8

# In[2]:


n = int(input())
num = list(input())

for i in range(0,n):
    num[i] = int(num[i])
print(sum(num))

