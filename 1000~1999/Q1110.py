#!/usr/bin/env python
# coding: utf-8

# In[1]:


n = int(input())
a = n; i = 1

while 1:    
    if a<10:
        n1 = 0; n2 = a
    else:
        n1 = a//10; n2 = a%10
        
    a = n2*10 + (n1+n2)%10
    
    if a == n :
        break
    
    i = i+1

print(i)

