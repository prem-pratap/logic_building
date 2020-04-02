#include<string.h>
#include<stdio.h>
int main() {
    char s1[100] = "programming ", s2[] = "is awesome";
    int i, j;

    // length of s1 is stored in i
    i=strlen(s1);

    // concatenating each character of s2 to s1
    for (j = 0; s2[j] != '\0'; ++j, ++i) {
        s1[i] = s2[j];
    }

    // terminating s1 string
    s1[i] = '\0';

    printf("After concatenation: ");
    printf("%s",s1);

    return 0;
}
