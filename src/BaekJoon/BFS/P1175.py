import sys 
from collections import deque 

def find_path(start):
    q = deque(start)
    visit = [[[1 for _ in range(m)] for _ in range(n)] for _ in range(4)]
    find_c = 0 
    find_save_point = deque()
    while q : 
        x,y,d,cnt = q.popleft()
        for before,(px,py) in enumerate(zip(dx,dy)): 
            if before == d : 
                continue 
            nx,ny= x+px,y+py
            if 0<=nx<n and 0<=ny<m and maps[nx][ny] != '#' and visit[before][nx][ny] : 
                if maps[nx][ny] == 'C' :
                    if not find_save_point :
                        find_c +=1 
                        if find_c == 2 : # 두개 다 찾음
                            return cnt+1
                    elif find_save_point[0][0] != nx or find_save_point[0][1] != ny : #처음 찾은 C와 다른 C임 
                        continue  
                    find_save_point.append((nx,ny,before,cnt+1))
                else : 
                    if find_save_point:
                        continue 
                    visit[before][nx][ny] -=1 
                    q.append((nx,ny,before,cnt+1))
        if not q and find_save_point: 
            visit = [[[1 for _ in range(m)] for _ in range(n)] for _ in range(4)]
            maps[find_save_point[0][0]][find_save_point[0][1]] = '.'
            while find_save_point: 
                q.append(find_save_point.pop())
    return -1 

n,m = map(int,sys.stdin.readline().split())
dx = [0,1,0,-1]
dy = [1,0,-1,0]
maps = [] 
start = [] 
for i in range(n): 
    line = list(sys.stdin.readline()[:-1])
    if not start and 'S' in line: 
        start.append((i,line.index('S'),-1,0))
    maps.append(line)
print(find_path(start))
