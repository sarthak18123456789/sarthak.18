#include<stdio.h>
void main()
{
	int n,i;
	
	printf("enter the size of array: ");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("enter %d elements:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	int min=arr[0];
	int max=arr[0];
	
	for(i=0;i<n;i++)
	{
	
	if(arr[i]<min)
	{
	min=arr[i];
	}
	if(arr[i]>max)
	{
	max=arr[i];
	}
}
	printf("Minimum number = %d\n", min);
    printf("Maximum number = %d\n", max);

    return 0;
	
}