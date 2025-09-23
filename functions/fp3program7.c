#include<stdio.h>
void calculate(int,int);
void main()
{
	oprator('%');
	int a,b;	
}
void oprator(int x,int y)
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