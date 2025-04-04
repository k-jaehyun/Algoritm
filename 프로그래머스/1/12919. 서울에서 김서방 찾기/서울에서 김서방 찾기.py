def solution(seoul):
    answer = '김서방은 '

    index = 0;
    for s in seoul:
        if(s=='Kim'):
            answer+= str(index)
        index+=1
    
    answer += '에 있다'
    return answer