#include<stdio.h>
void main()
{
	char source[]="hello";
	char destination[50];
	
	strncat(destination,source,3);
	
	printf("source wtring:%s\n",source);
	printf("destination string (after strncat):%s\n",destination);
}