#!/usr/bin/env python
# coding: utf-8

# In[1]:


a = list(map(int, input().split()))
a.remove(max(a))
a.remove(min(a))
print(a[0])

