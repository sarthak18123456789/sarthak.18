#include<stdio.h>
void operator();
void main()
{
	oprator();	
}
void oprator()
{

	int a=5;
	int b=2;
	char op='%';
	
	if(op=='+')
	{
		printf("%d",a+b);
	}
	else
	if(op=='-')
	{
		printf("%d", a-b);
	}else
	if(op=='*')
	{
		printf("%d",a*b);
	}else
	if(op=='/')
	{
		printf("%d",a/b);
	}else
	if(op=='%')
	{
	
		printf("%d",a%b);
	}else
	{
		printf("invalid operator");
	}
}