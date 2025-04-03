def solution(numbers):
    answer = 0
    
    sumN = 0
    for num in numbers:
        sumN+=num
    
    answer = sumN/len(numbers)
    
    return answer