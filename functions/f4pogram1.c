#include<stdio.h>
int isprime(int);
void main()
{
	int res=isprime(7);
	if (res==1)
	printf(" it is prime number");
	else
	printf(" it is not prime number");
}
int isprime(int no)
{
	
	int i=2;
	int status=0;
	while(i<=no/2)
	{
		if(no%i==0)
		{
		
		status=1;
		break;
		}i++;
	}
	if(status==0)
	{
	
		return 1;
	}
	else
	{
		return 0;
	}
	
}
