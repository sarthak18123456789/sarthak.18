#include<stdio.h>
void totalprice();
void main()
{
	totalprice('float price');
	totalprice('char isStudent');	
}

void totalprice(float x,char y)
{	
	
	float price=400,totalprice;
	char isStudent;
	if(isStudent=='y')
	{
		if(price>500)
		totalprice=price-price*0.20;
		else
		totalprice=price-price*0.10;
	}
	else
	{
		if(price>600)
		totalprice=price-price*0.20;
		else
		totalprice=price-0;
	}
	printf("total price after discount=%.2f\n",totalprice);
	
}