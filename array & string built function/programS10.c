#include<stdio.h>
#include<stdio.h>
int main()
{
	char str[]="c,java,paython,c++";
	char *token;
	
	printf("orignal striing:%s\n");
	token=strok(str,",");
	
	while(token!='\0')
	{
		printf("token:%s\n",token);
		token=strok('\0');
	}
	return 0;	
}