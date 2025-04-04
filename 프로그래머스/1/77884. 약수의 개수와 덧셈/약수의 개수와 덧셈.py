def solution(left, right):
    answer = 0
    
    for i in range(left,right+1):
        total = 0
        for j in range(1,int(i**(1/2)+1)):
            if(j*j==i):
                total+=1
                continue
            if(i%j==0):
                total+=2
        if(total%2==0):
            answer+=i
            print(i)
        else:
            answer-=i
    
    return answer