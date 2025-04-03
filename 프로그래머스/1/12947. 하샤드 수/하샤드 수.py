def solution(x):
    answer = True
    
    string = str(x)
    su=0
    for s in string:
        su+=int(s)
    
    if(x%su!=0):
        answer=False
    
    return answer