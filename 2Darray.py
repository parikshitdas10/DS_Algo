import numpy as np
N = 2
A = [0, 1, 0, 1]
S = "RCRR"
rows, cols = (N, N)
arr = [[0]*cols]*rows
i = j = 0
for k in range(0, len(S)):
    if(S[k] == "R"):
        row = A[k]
        for i in range(0, len(arr[i])):
            arr[row][i] += 1
    else:
        col = A[k]
        for j in range(0, len(arr)):
            arr[j][col] += 1
    print(arr)
ans = max(max(x) for x in arr)


# for i in range(len(arr)):
# for j in range(len(arr[i])):
