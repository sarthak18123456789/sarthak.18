#include<stdio.h>
void evenodd(int arr[],int n);
void main()
{
	
	int i,n;
	printf("enter the size of array:");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("enter %d element:\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	
	}
	evenodd(arr, n);
	return 0;
}


void evenodd(int arr[],int n)
 {	
 	int i;

	printf("\n even number in array:");
	for(i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			printf("%d ",arr[i]);
		}
	
	}
	
		printf("\n odd number in array: ");
	for(i=0;i<n;i++)
	{
	
		if(arr[i]%2!=0)
	{
			printf("%d ",arr[i]);
	}
	}

}
