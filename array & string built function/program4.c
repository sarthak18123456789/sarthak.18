#include<stdio.h>
void main()
{
	int i,n;
	printf("enter the size of array: ");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("enter %d element:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("alternative element in array:\n");
	for(i=0;i<n;i+=2)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}