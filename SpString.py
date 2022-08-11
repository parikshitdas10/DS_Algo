def solution(A, B, C):
    # write your code
    str = ""
    fa = fb = fc = 0
    while(A > 0 or B > 0 or C > 0):
        mf = 0
        if(A >= 2 and fa != 1):
            fb = fc = 0
            str = str+"aa"
            fa = 1
            A -= 2
            mf = 1
        elif(A == 1 and fa != 1):
            fb = fc = 0
            str = str+"a"
            A -= 1
            mf = 1
        elif(C >= 2 and fc != 1):
            fa = fb = 0
            str = str+"cc"
            fc = 1
            C -= 2
            mf = 1
        elif(C == 1 and fc != 1):
            fa = fb = 0
            str = str+"c"
            C -= 1
            mf = 1
        elif(B >= 2 and fb != 1):
            fa = fc = 0
            str = str+"bb"
            fb = 1
            B -= 2
            mf = 1
        elif(B == 1 and fb != 1):
            fa = fc = 0
            str = str+"b"
            B -= 1
            mf = 1
        if(mf == 0):
            return(str)
    return(str)


print(solution(1, 3, 1))
