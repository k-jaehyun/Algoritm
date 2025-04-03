def solution(a, b):
    answer = 0
    
    q = int(str(a)+str(b))
    w = int(str(b)+str(a))
    
    if q>=w:
        answer = q
    elif q<w:
        answer = w
    
    return answer