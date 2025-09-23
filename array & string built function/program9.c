#include<stdio.h>
#include<string.h>
void main()
{
	
	char str1[]="sarthak";
	char str2[]="sarthak";
	
	
	char *pos=strstr(str1,str2);
	if(*pos != '\0')
	{
	printf("substring \"%s\" found at position:%td\n",str2,pos-str1);
	printf("Remaining string from match: %s\n", pos);
	}
	else
	{
		printf("substring \"%s\" not found\n",str2);
	}
	return 0;
}