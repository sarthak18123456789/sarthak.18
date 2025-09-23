#include<stdio.h>
void checkamstrong();
void main()
{
	checkamstrong();	
}
void checkamstrong()
{

	int no=153, r,sum;
	int temp=no;
	while(temp!=0)
	{
		r=temp%10;
		sum=sum+r*r*r;
		temp=temp/10;
	}
	if(sum==no)
	{
		printf("it is armstrong number",r);
		
	}
	else
	{
		printf("it is not armstrong number",r);
	}
}