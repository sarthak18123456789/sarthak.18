#include<stdio.h>
void checksum(int arr[],int n);
void main()
{
	int i,n ,sum=0;
	printf("enter the size of array: ");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("enter %d element:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	checksum( arr, n);
	return 0;
}
void checksum(int arr[],int n)
{
	int sum;
	int i;
	for(i=0;i<n;i++)
	{
		sum+=arr[i];
	}
	printf("Sum of all numbers = %d\n", sum);
	
	
}