#include<stdio.h>
void chechar();
void main()
{
	chechar();
	
}
void chechar()
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