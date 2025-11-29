package s1;

public class Student
{
    int rollno;
    String name;
    double marks;
    
    //parameterize constructor 
    Student(int rollno,String name,double marks)
    {
    	this.rollno=rollno;
    	this.name=name;
    	this.marks=marks;
    }
    void CalculateMarks()
    {
    	 
    	try
    	{
    		if(marks <0 || marks>100)
    		{
    			throw new InvalidMarksException() ;
    		}
    	
    	if(marks>=35 && marks <=49 )
    	{
    		
    			System.out.println("Pass class");
    		
    	}
    	else if(marks>=50 && marks <=59)
    	{
    		System.out.println("second class");
    	}
    	else if(marks>=60 && marks <=74)
    	{
    		System.out.println("First class");
    	}
    	else if(marks>75)
    	{
    		System.out.println("Distinction ");
    	}
    	else if(marks<35)
    	{
    		System.out.println("Fail ");
    	}
    	
    	}
    	catch(InvalidMarksException e)
    	{
    		System.out.println("Invalid Marks! Marks should be between 0 to 100.");
    	}
}
}


public class InvalidMarksException extends Exception {

	InvalidMarksException()
    {
        super("Marks out of range");
    }
}


public class Test 
{
       public static void main(String[] args)
       {
    	   Student s1=new Student(20,"sarthak",101);
    	   s1.CalculateMarks();
       }
}