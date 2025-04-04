import sys

def solution(arr):
    answer = []
    minNum = sys.maxsize
    
    if(len(arr)==1):
        return [-1]
    
    for n in arr:
        if(n<minNum):
            minNum = n
    
    arr.remove(minNum)
    
    return arr