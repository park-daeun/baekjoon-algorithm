#!/usr/bin/env python
# coding: utf-8

# In[2]:


def dial(x):
    if set(x) <= {'A','B','C'}:
        return 3
    if set(x) <= {'D','E','F'}:
        return 4
    if set(x) <= {'G','H','I'}:
        return 5
    if set(x) <= {'J','K','L'}:
        return 6
    if set(x) <= {'M','N','O'}:
        return 7
    if set(x) <= {'P','Q','R','S'}:
        return 8
    if set(x) <= {'T','U','V'}:
        return 9
    if set(x) <= {'W','Y','X','Z'}:
        return 10
    
s = input(); time = 0

for a in s:
    time = time + dial(a)
    
print(time)

