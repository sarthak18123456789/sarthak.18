#include<stdio.h>
void sum();
void main()
{
	sum();	
}
void sum()
{

	int no =1253637;
	int r1,sum;
	int ld=no%10;
	while(no>0)
	{
		r1=no%10;
		no=no/10;
		sum=r1+ld;
	}
	printf(" sum of first and last digit is =%d",sum);
}