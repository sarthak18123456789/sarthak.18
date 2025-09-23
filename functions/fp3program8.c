#include<stdio.h>
void cheresult(int);
void main()
{
	cheresult('a');
}
void cheresult(int x)
{

	int a=56;
	
	if(a>=75)
	{
		printf("Distinction");
	}
	else
		if(a>=65)
		{
			printf("First class");
		}
	
	else
		if(a>=55)
		{
			printf("Second class");
		}
	
	else
		if(a>=40)
		{
			printf("pass class");
		}
	
	else
	if(a<=40)
	{
		printf("fail");
	}
}