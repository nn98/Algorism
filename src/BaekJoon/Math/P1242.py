N, K, M = map(int, input().split())
M -= 1 #동호의 인덱스
start = 0
for i in range(1, N + 1):
    removed = (start + K - 1) % N
    if removed == M:
        print(i)
        break
    if removed < M:
        M -= 1
    if removed > M:
        pass
    start = removed
    N -= 1
