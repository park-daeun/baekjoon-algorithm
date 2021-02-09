#!/usr/bin/env python
# coding: utf-8

# In[1]:


for i in range(0,3):
    burger = int(input())
    if i == 0:
        low_b = burger
    else:
        if low_b > burger:
            low_b = burger
            
for j in range(0,2):
    soda = int(input())
    if j == 0:
        low_s = soda
    else:
        if low_s > soda:
            low_s = soda

print(low_b+low_s-50)

