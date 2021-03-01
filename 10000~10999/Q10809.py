#!/usr/bin/env python
# coding: utf-8

# In[1]:


s = input()

for x in range(97,123):
    try:
        print(s.index(chr(x)), end=' ')
    except:
        print(-1, end=' ')

