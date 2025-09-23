#include<stdio.h>
void checkleapyear(int);
void main()
{
	int year=2003;
	leapyear();
}
void leapyear(int year)
{

	if(year%4==0&& year%100!=0||year%400==0)
	{
		printf("it is leap year");
	}
	else
	{
		printf("it is not leap year");
	}
}
