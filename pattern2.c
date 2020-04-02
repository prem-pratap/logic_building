#include <stdio.h>

int main()
{
    int n,right=0;
    for (int i=1;i<=10;i++){
        for(int j=1;j<=10-i;j++)
            printf(" ");
        for (int k=1;k<=i;k++){
            printf("%d",k);
        }
        if (i != 1){
            for ( n=right;n>=1;n--)
                printf("%d",n);
        }
        right++;    
        printf("\n");
    }

    return 0;
}
