#include<stdio.h>
void checksum();
void main()
{
	checksum();	
}
void checksum()
{

	int start=1,end=5,sum=0,i;
	for(int i=start;i<=end;i++)
	{
		sum+=i;
	}
	printf("sum=%d",sum);
	
	
}