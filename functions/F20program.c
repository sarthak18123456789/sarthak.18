#include<stdio.h>
void checkdivision();
void main()
{
	
	checkdivision();
}
 void checkdivision()
{

	int a=15;
	if(a%5==0 && a%3==0)
	{
		printf("Divisible by both\n");
	}else
	if(a%5==0)
	{
		printf("divisibal by 5 but not 3\n");
	}
	else
	if(a%3==0)
	{
		printf("divisibal by 3 but not 5\n");
	}
	else
	{
		printf("divisibal by none\n");
	}
	
	
}