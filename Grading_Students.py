#https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'gradingStudents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY grades as parameter.
#

def gradingStudents(grades):
    rounded_grades = []
    for x in range(0, len(grades)):
        if grades[x] < 38:
            rounded_grades.append(grades[x])
        elif (5 * round(grades[x]/5) - grades[x]) < 3 and (5 * round(grades[x]/5) - grades[x]) > -1:
            rounded_grades.append(5 * round(grades[x]/5))
        else: rounded_grades.append(grades[x])       
    return rounded_grades

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    grades_count = int(input().strip())

    grades = []

    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)

    result = gradingStudents(grades)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
