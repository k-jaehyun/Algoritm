def solution(absolutes, signs):
    answer = 0
    index=0
    
    for a in absolutes:
        if(signs[index]==True):
            answer+=a
        else:
            answer-=a
            print(a)
        index+=1
    
    return answer