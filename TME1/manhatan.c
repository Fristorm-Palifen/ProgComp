#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

#define VIDE -1
#define TAILLE 9

int norme(int x) {
    return (x+TAILLE)%TAILLE;
}

void dist(int px,int py,int d,int m[TAILLE][TAILLE]) {
    int npx = norme(px), npy = norme(py);
    if (m[npx][npy] == -1 || m[npx][npy] > d) {
        m[npx][npy] = d;
        dist(px+1,py,d+1,m);
        dist(px-1,py,d+1,m);
        dist(px,py+1,d+1,m);
        dist(px,py-1,d+1,m);
    }
}


int main(int argc, char **argv) {
    int mur = INT_MIN;
    int monde[TAILLE][TAILLE];
    for (int i=0;i<TAILLE;i++){
       for (int j=0;j<TAILLE;j++){ 
           monde[i][j]=-1;
       }
    }
    monde[2][4]=INT_MIN;
    monde[3][4]=INT_MIN;
    monde[2][5]=INT_MIN;
    dist (2,3,0,monde);
    for (int i=0;i<TAILLE;i++){
       for (int j=0;j<TAILLE;j++){ 
           if (monde[i][j]==INT_MIN)
           {
               printf(". ");
           }else
           {
               printf("%d ",monde[i][j]);
           }
       }
       printf("\n");
    }
    
    //printf("%d \n", monde[7][3]);

}