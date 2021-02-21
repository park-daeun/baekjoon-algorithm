#!/usr/bin/env python
# coding: utf-8

# In[2]:


A,B = map(int, input().split())
if A>B:
    print('>')
if A<B:
    print('<')
if A==B:
    print('==')

