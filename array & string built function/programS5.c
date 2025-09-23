#include<stdio.h>
void main()
{
	char str1[]="hello";
	char str2[]="hellower";
	char str3[]="sarthak";
	
	int result1= strcmp(str1,str2);
	if(result1==0)
	{
		printf("str1 is equal to str2\n");
	}
	else
	if(result1>0)
	{
		printf("str1 is more then str2\n");
	}
	else
	{
		printf("str1 is less then str2\n");
	}
	
	int result2=strcmp(str1,str3);
	if(result2==0)
	{
		printf("str1 ans str3 is equal\n");
	}
	else
	if(result2>0)
	{
		printf("str1 is more then str3\n");
	}
	else
	{
		printf("str1 is less then str3");
	}
	

}