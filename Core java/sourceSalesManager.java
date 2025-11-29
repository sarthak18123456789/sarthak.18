class SalesManager 
{
  int id;
  String name;
  double salary;
  double incentive;
  double target;

//default constructor
SalesManager()
{
  this.id=101;
  this.name="Rohan";
  this.salary=4000;
  this.incentive=1000;
  this.target=50;
}//default constructor end here

//parameterize constructor

SalesManager(int a,String str,double s,double i,double t)
{
  this.id=a;
  this.name=str;
  this.salary=s;
  this.incentive=i;
  this.target=t;
}//parameterize constructor end here


  void setid(int x)
{
  this.id=x;
}
void setname(String str)
{
  this.name=str;
}
void setsalary(double a)
{
  this.salary=a;
}
void setincentive(double c)
{
  this.incentive=c;
}
void settarget(double b)
{
  this.target=b;
}// set end here

int getid()
{
  return this.id;
}
String getname()
{
  return this.name;
}
double getsalary()
{
  return this.salary;
}
double getincentive()
{
  return this.incentive;
}
double gettarget()
{
  return this.target;
}// get end here

void display()
{
System.out.println("SalesManager id is: " + this.id);
System.out.println("SalesManager name is: " + this.name);
System.out.println("SalesManager salary is: " + this.salary);
System.out.println("SalesManager incentive is: " + this.incentive);
System.out.println("SalesManager  target is: " + this.target);
}// Display end here

}//class end here

class Test
{
 public static void main(String[] args)
{
  SalesManager S1;
  S1=new SalesManager();
  S1.setid(101);
  S1.setname("Rohan");
  S1.setsalary(4000);
  S1.setincentive(1000);
  S1.settarget(50);

System.out.println("\n--- Display using method ---");

S1.display();

   } //main end here

} //test end here


   