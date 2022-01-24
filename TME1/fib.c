#include <stdio.h>
#include <stdlib.h>

int fib(int n){
    if (n==1||n==2){
        return 1;
    }else if (n<=0)
    {
        printf("Erreur val<=0\n");
        return -1;
    }
    int s1=1,s2=1,res=1;
    int i=3;
    while (i<=n){
        res=s1+s2;
        s1=s2;
        s2=res;
        i++;
    }
    return res;
}


int main(int argc, char const *argv[])
{
    printf("%d\n",fib(atoi(argv[1])));
    return 0;
}
