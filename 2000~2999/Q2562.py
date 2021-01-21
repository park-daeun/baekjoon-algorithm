#!/usr/bin/env python
# coding: utf-8

# In[4]:


a = []
for i in range(0,9):
    n = int(input())
    a.append(n)

print(max(a))
max_index = a.index(max(a))+1
print(max_index)

