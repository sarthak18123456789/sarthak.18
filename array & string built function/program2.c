#include<stdio.h>
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
	
	for(i=0;i<n;i++)
	{
		sum+=arr[i];
	}
	printf("Sum of all numbers = %d\n", sum);

	return 0;
	
	
}