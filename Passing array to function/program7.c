#include<stdio.h>
void checkmerged(int arr[],int brr[],int crr[]);
void main()
{
	int i,j;
	int arr[5]={1,2,3,4,5};
	int brr[5]={0,6,7,8,9};
	int crr[10];
	
	checkmerged(arr,brr,crr);
	
	return 0;
	
}
void checkmerged(int arr[],int brr[],int crr[])
{
	int i,j;
	for(i=0;i<5;i++)
	{
	crr[i]=arr[i];
	}
	for(j=0;j<5;j++)
	{
		crr[i+j]=brr[j];
	}
	printf("merged array:\n");
	for(i=0;i<10;i++)
	{
		printf("%d ",crr[i]);
	}
	return 0;
}