#include<stdio.h>
void checkrev();
void main()
{
	checkrev();
}
 void checkrev()
 {
 
	int no=1234;
	int reversed=0;
	
	while(no!=0)
	{
	
	int digit=no%10;
	reversed=reversed*10+digit;
	no=no/10;
	}
	printf("reversed number =%d ",reversed);
	
}