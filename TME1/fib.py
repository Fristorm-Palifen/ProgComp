import sys

def fib (v):
    if (v<=0):
        print("Errreur v<=0")
    elif (v==1 or v==2):
        return 1
    else:
        s1=1
        s2=1
        res=1
        i=3
        while (i<=v):
            res=s1+s2
            s1=s2
            s2=res
            i+=1
        return res

print(fib( int(sys.argv[1])))