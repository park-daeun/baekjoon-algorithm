#!/usr/bin/env python
# coding: utf-8

# In[1]:


s = input(); num = 0
cro = ['c-','c=','dz=','d-','lj','nj','s=','z=']

for x in cro:
    num = num + s.count(x)
    s = s.replace(x,' ')

s = s.replace(' ','')
print(num+len(s))

