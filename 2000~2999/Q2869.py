#!/usr/bin/env python
# coding: utf-8

# In[1]:


a,b,v = map(int, input().split())

import math
day = math.ceil((v-a)/(a-b))

print(1+day)

