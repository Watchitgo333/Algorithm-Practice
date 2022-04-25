#Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
#Then print the respective minimum and maximum values as a single line of two space-separated long integers.
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    arr.sort()
    min = 0
    max = 0
    for x in arr:
        if x > arr[0]:
            # print(x)
            max +=x
        if x < arr[0]:
            # print(x)
            max += x
        elif x < arr[len(arr)-1]:
            min += x
    if x == arr[0]:
        for i in range(0,len(arr)-1):
            min += arr[i]
            max += arr[i]
    print(min, max)
        

        
            
if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
