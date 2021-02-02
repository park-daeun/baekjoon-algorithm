#!/usr/bin/env python
# coding: utf-8

# In[1]:


a = int(input())
if (not(a%4) and a%100) or not(a%400):
    print('1')
else:
    print('0')

