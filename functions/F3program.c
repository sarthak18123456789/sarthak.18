#include<stdio.h>
void year();
void main()
{
	year();
	
}//main end

void year()
{

	int year=2003;
	if(year%4==0&& year%100!=0||year%400==0)
	{
		printf("it is leap year");
	}
	else
	{
		printf("it is not leap year");
	}
}
