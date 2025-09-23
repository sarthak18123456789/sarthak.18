#include<stdio.h>
void main()
{
	int i,n;
	printf("enter the size of array:");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("enter %d element:/n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	
	}
	
	printf("\n even number in array:");
	for(i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			printf("%d",arr[i]);
		}
	}
	
	{
		printf("\n odd number in array: ");
	for(i=0;i<n;i++)
	{
	
		if(arr[i]%2!=0)
	{
			printf("%d ",arr[i]);
	}
	}
	return 0;
}
}
