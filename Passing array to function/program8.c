#include<stdio.h>
void checkrevers(int arr[],int brr[],int n);
void main()
{
	int i,n=5;
	int arr[5]={1,2,3,4,5};
	int brr[5];
	
	checkrevers(arr,brr,n);
	return 0;
}

void checkrevers(int arr[],int brr[],int n)
{
	
	int i;
	for(i=n-1;i>=0;i--)
	{
		printf("%d ",arr[i]);
		
	}
	
	
}