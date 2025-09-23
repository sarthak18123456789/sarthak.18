#include<stdio.h>
void checkno();
void main()
{
	checkno();
}
void checkno()
{
	int no=-2;
	if(no>0)
	{
		printf("it is a positive number");
	}
	else
	if(no==0)
	{
		printf("it is a zero number ");
	}
	else
	if(no<0)
	{
		printf("it is a negative number");
	}
}