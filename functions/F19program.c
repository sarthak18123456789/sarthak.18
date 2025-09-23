#include<stdio.h>
void checkpalindrome();
void main()
{
	checkpalindrome();
}
void checkpalindrome()
{

	int no=168;
	int i=no;
	int rev=0;
	
	while(no>0)
	{
	
	int digit = no%10;
	rev=rev*10+digit;
	no=no/10;	
	}
	if (i==rev)
	{
		printf("%d is a Palindrome number\n", i);
	}
	else
	{
		printf("%d is not a Palindrome number\n", i);
	}
}