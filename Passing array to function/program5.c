#include<stdio.h>
void chechkprime(int arr[],int n);
void main()
{
	int i,n,j,flag,num;
	
	printf("enter the size of array:");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("enter %d element:\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	chechkprime(arr,n);
}
void chechkprime(int arr[],int n)
{
		int i,j,flag,num;
		printf("prime number in array:");
		for(i=0;i<n;i++)
		{
		
		int num = arr[i];
        flag = 1;   

        if (num <= 1) {
            flag = 0; 
        } else {
            for (j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    flag = 0; 
                    break;
                }
            }
        }

        if (flag == 1)
		 {
            printf("%d ", num);
    }
}
}
