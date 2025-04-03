def solution(n):
    answer = 0
    li = [s for s in str(n)]
    li.sort(reverse =True)
    print(li)
    string = ""
    for s in li:
        string+=s
    
    return int(string)