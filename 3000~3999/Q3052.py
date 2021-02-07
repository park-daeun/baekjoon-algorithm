#!/usr/bin/env python
# coding: utf-8

# In[1]:


remainder = []
for i in range(0,10):
    n = int(input())
    remainder.append(n%42)
    
s = set(remainder)
print(len(s))

