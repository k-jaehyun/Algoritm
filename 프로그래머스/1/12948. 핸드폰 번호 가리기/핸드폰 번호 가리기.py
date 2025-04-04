def solution(phone_number):
    answer = ''
    index = 0
    
    for n in phone_number:
        if(index>=(len(phone_number)-4)):
            answer+=n
        else:
            answer+="*"
        index+=1
    
    return answer