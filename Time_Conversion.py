#!/bin/python3
#Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
#Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
#12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

import math
import os
import random
import re
import sys
#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    # print(str(int(s[0:2:])-12) + s[2:8])
    # print(s[8:] == "AM" and s[0:2] == '12')
    # print(s[0:2]=='12')
    if s[8:] == "PM" and s[0:2] == '12':
        return "12" + s[2:8]
    elif s[8:] == "PM":
        new_pm = str(int(s[0:2:])+12) + s[2:8]
        return new_pm
    elif s[8:] == "AM" and s[0:2] == '12':
        return '00' + s[2:8]
    else:
        return s[0:8]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
