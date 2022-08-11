
c = 0
lst1 = []
lst2 = []
for i in range(len(A)):
    for j in range(len(A)):
        for charA in A[i:j]:
            lst1.append(charA)
        for charB in B[i:j]:
            lst2.append(charB)
        lst1.sort()
        lst2.sort()
        if lst1 == lst2:
            c = c+1
        lst1.clear()
        lst2.clear()
print(c)
