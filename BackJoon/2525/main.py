T = int(input())

if T % 10 != 0:
    print(-1)

else:
    A= T//300      
    B= T%300//60   
    C= T%300%60//10
    print(A,B,C)
