#!/usr/bin/env python
# coding: utf-8

# In[1]:


memo = dict()
def people(floor,ho):
    if str(floor)+'_'+str(ho) in memo:
        return memo[str(floor)+'_'+str(ho)]
    
    if floor == 0:
        memo[str(floor)+'_'+str(ho)] = ho
        return ho
    
    else:
        ho_0 = 0
        s = 0
        
        for i in range(ho+1):
            s += people(floor-1,i)
            
        r_ho = ho_0 + s
        memo[str(floor)+'_'+str(ho)] = r_ho
        return r_ho
    
t = int(input())

for _ in range(t):
    k = int(input())
    n = int(input())
    print(people(k,n))

