#include<stdio.h>
void chechar(char);
void main()
{
	chechar('o');
	
}
void chechar(char x)
{

	char c='O';
	if(c>='A' && c<='Z')
	{
	
		printf("it is uppercase character");
	}
	
	else
	if(c>='a' && c<='z')
	{
		printf(" it is lowercase charater");
	}

}