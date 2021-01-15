#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())

a = [1]
for i in range(1,20000):
    a.append(a[i-1]+6*i)
    
a.append(n)
print(sorted(a).index(n)+1)

