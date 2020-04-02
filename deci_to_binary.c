#include <stdio.h>

int main()
{
    int i=0,num=7,binary[32];
    while (num>0){
        binary[i]=num%2;
        num=num/2;
        i++;
    }
    for(int j=i-1;j>=0;j--)
        printf("%d ",binary[j]);
    return 0;
}
