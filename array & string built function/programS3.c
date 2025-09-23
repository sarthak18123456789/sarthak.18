#include<stdio.h>
#include<string.h>
void main()

{
	char source[]="hello";
	char destination[50];
	
	strcat(destination,source);
	
	printf("source wtring:%s\n",source);
	printf("destination string (after strcat):%s\n",destination);
}