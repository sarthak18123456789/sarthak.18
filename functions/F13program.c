#include<stdio.h>
void prime(); 
void main()
{
	prime();
}
void prime()
{

	int no=7;
	int i=2;
	int status=0;
	while(i<=no/2)
	{
		if(no%i==0)
		status=1;
		break;
	}
	i++;
	if(status==0)
	{
		printf("it is prime number");
	}
	else
	{
		printf("it is not prime number");
	}
	
	
}