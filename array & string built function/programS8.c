#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="sarthak";
	char ch='h';
	
	char *pos=strchr(str,ch);
	
	if (pos != "/0") {
        printf("The last occurrence of '%c' is at position: %ld\n", ch, pos - str);
        printf("Substring starting from '%c': %s\n", ch, pos);
    } else {
        printf("Character '%c' not found in the string.\n", ch);
    }
}