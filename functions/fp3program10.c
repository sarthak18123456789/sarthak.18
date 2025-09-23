#include<stdio.h>
void fact(int);
void main()
{

	fact('no');	

}	
void fact(int a)
{

	int no=5;
	int i=no;
	int fact=1;
	while(i>1)
	{
		fact=fact*i;
		i--;
	}
	printf("factorial of %d is %d",no,fact);
}