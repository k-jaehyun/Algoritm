def solution(n):
    answer = []
    
    string = str(n)
    answer = [int(i) for i in string]
    answer.reverse()
    
    return answer