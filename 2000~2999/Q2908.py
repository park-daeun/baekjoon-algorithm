#!/usr/bin/env python
# coding: utf-8

# In[2]:


a,b = input().split()

r_a = ''; r_b = ''
for x,y in zip(reversed(a),reversed(b)):
    r_a = r_a + x
    r_b = r_b + y

if int(r_a) > int(r_b):
    print(r_a)
else:
    print(r_b)

