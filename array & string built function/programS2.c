#include<stdio.h>
void main()
{
	char source[]="hello";
	char destination[50];
	
	strcpy(destination,source);
	
	printf("source wtring:%s\n",source);
	printf("destination string (after strcpy):%s\n",destination);
}