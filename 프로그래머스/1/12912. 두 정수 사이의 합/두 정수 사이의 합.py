def solution(a, b):
    answer = 0
    
    maxN = a
    minN = b
    if(a<b):
        maxN=b
        minN=a
    
    return sum(i for i in range(minN,maxN+1))
    
    return answer