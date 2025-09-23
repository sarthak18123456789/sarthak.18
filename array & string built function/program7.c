#include<stdio.h>
void main()
{
	int i,j;
	int arr[5]={1,2,3,4,5};
	int brr[5]={0,6,7,8,9};
	int crr[10];
	
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