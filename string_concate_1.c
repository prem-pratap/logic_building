#include <stdio.h>
#include<string.h>
int main()
{
    char st1[10]="hello",st2[10]="world",st3[50];
    int i,j,len,end;
    end=strlen(st2);
    len=strlen(st1)+strlen(st2);
    for (i=0;i<len;i++){
        if(i<strlen(st1))
            st3[i]=st1[i];
        else{
            st3[i]=st2[end-1];
            end=end-1;
        }
    }
    printf("%s",st3);
    return 0;
}
