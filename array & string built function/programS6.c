#include <stdio.h>
#include<string.h>
int main() {
    char str1[] = "HelloWorld";
    char str2[] = "HelloOpenAI";

    
    int result = strncmp(str1, str2, 5);

    if (result == 0) {
        printf("First 5 characters are the same.\n");
    } else if (result < 0) {
        printf("First 5 characters of str1 are less than str2.\n");
    } else {
        printf("First 5 characters of str1 are greater than str2.\n");
    }

   
    result = strncmp(str1, str2, 7);
    if (result == 0) {
        printf("First 7 characters are the same.\n");
    } else {
        printf("First 7 characters are different.\n");
    }
}