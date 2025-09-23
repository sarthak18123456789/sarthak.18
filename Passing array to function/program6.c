#include<stdio.h>
void checksum(int arr[],int brr[],int crr[]);
void main()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={10,20,30,40,50};
	int crr[5];
	checksum(arr,brr,crr);
	
	return 0;
}

void checksum(int arr[],int brr[],int crr[])	
{

	int i;
	
	for(int i=0;i<5;i++)
	{
		crr[i]=arr[i]+brr[i];
	}for(int i=0;i<5;i++)
	{
	printf("%d ",crr[i]);
	}
	return 0;
}