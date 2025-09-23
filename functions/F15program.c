#include<stdio.h>
void checkperfect();
void main()
{
	checkperfect();
}
void checkperfect()
{

	int num=27,sum=0;
	int i;
	for(i=1; i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==num)
	{
		printf("it is perfect number");
	}
	else
	{
		printf("it is not perfect number");
	}
}