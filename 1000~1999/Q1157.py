#!/usr/bin/env python
# coding: utf-8

# In[1]:


s = input()
s = s.upper()

cnt = 0
for x in set(s):
    if cnt < s.count(x):
        many = x
        cnt = s.count(x)
    elif cnt == s.count(x):
        many = '?'
    
print(many)

