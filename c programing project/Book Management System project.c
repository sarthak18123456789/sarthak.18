#include<stdio.h>
#include<string.h>
#include<stdlib.h>

// struct + prototypes
typedef struct Book
{
	int id;
	char name[30];
	char authorname[40];
	char category[50];
	float price;
	float rating;
}Book;

//function declaration

void addBook(Book*,int*);
void removeBook(Book*,int*);
void searchBook(Book*,int*);
void showauthorsBook(Book*,int*);
void showcategoryBooks(Book*,int*);
void updateBook(Book*,int*);
void displaysoortedBook(Book*,int*);
void displayallBook(Book*,int*);

// ----------------- main function -----------------
void main()
{
	int capacity=100;
	Book *books=(Book*) malloc (capacity * sizeof (Book));
	int count=0;
	
	int choice;
	int book ;
	for(;;)
	{
		printf("\n==== Book Management System ====\n");
		printf("1. addBook\n");
		printf("2. removeBook\n");
		printf("3. searchBook\n");
		printf("4. showauthorsBook\n");
		printf("5. showcategoryBooks\n");
		printf("6. updateBook\n");
		printf("7. displaysoortedBook\n");
		printf("8. displayallBook\n");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1:
				printf("\n add Book function called\n");
				if(count>=capacity)
				{
					capacity *=2;
					books=realloc(books,capacity * sizeof(Book));
					if (books == NULL)
					 {
                		printf("Memory reallocation failed!\n");
               			 exit(1);
            		}
					printf("Capacity increased to %d\n",capacity);
				}
				addBook(books, &count);
			break;
			case 2:
				printf("\n removeBook function called\n");
				removeBook(books, &count);
			break;
			case 3:
				printf("\n searchBook function called\n");
				searchBook(books, &count);
			break;
			case 4:
				printf("\n showauthorsBook function called\n");
				showauthorsBook(books, &count);
			break;
			case 5:
				printf("\n showcategoryBooks function called\n");
				showcategoryBooks(books, &count);
			break;	
			case 6:
				printf("\n updateBook function called\n");
				updateBook(books, &count);
			break;
			case 7:
			    printf("\n displaysoortedBook function called\n");
			    displaysoortedBook(books, &count);
			break;
			case 8:
				printf("\n displayallBook function called\n");
				displayallBook(books, &count);
			break;	
			case 9:
			 printf("\nExiting program...\n");
                free(books);
                exit(0);
            default:
                printf("\nInvalid choice!\n");
		}
	}
	
}

// ----------------- function definitions -----------------


//------------------add book------------------


void addBook(Book *books,int *count)
{
	Book newBook;
	
	printf("Enter Book Id: ");
	scanf("%d",&newBook.id);
	
	printf("Enter Book name: ");
	scanf("%s",newBook.name);
	
	printf("Enter Author name : ");
	scanf("%s",newBook.authorname );
	
	printf("Enter Category: ");
	scanf("%s",&newBook.category);
	
	printf("Enter Book price: ");
	scanf("%lf",&newBook.price);
	
	printf("Enter Book Rating: ");
	scanf("%lf",&newBook.rating);
	
	 books[*count] = newBook;
    (*count)++;

    printf("\n Book added successfully!\n");
}

void alldisplay(Book *books,int *count)
{
	if(*count==0)
	{
		printf("\n no Books are available");
		return;
	}
	printf("\n-----All Books-----\n");
	for(int i=0;i<*count;i++)
	{
		printf("id:%d | name:%s | Author:%s | Category:%s | price:%lf |Rating:%lf\n", books[i].id, books[i].name, books[i].authorname,
               books[i].category, books[i].price, books[i].rating);
	}
}

