class ElectricityBill
{
static double ratePerUnit = 8.50;

  String CustomerName;
  int customernumber;
  int unitconsumed;


// default constructor

ElectricityBill()
{
  this.CustomerName="Sarthak";
  this.customernumber=0;
  this.unitconsumed=10;
}// default constructor end


// parameterized constructor

ElectricityBill(String n,int c,int u)
{
  this.CustomerName=n;
  this.customernumber=c;
  this.unitconsumed=u;
}// parameterized constructor end


// static method to change rate

 public static void changeRate(double newRate)
    {
        ratePerUnit = newRate;
    }

// getter and setter methods  
    public String getCustomerName()
    {
        return CustomerName;
    }

    public void setCustomerName(String name)
    {
        this.CustomerName = name;
    }

    public int getcustomernumber()
    {
        return customernumber;
    }

    public void setcustomernumber(int number)
    {
        this.customernumber = number;
    }

    public int getunitconsumed()
    {
        return unitconsumed;
    }

    public void setunitconsumed(int units)
    {
        this.unitconsumed = units;
    }

// non-static method to calculate bill
    double calculateBill()
    {
        return unitconsumed * ratePerUnit;
    }


void display()
{
  System.out.println("customer Name is: " +this.CustomerName);
  System.out.println("customer number  is: " +this.customernumber);
  System.out.println("unit consumed: " +this.unitconsumed);
  System.out.println("Rate Per Unit   : " + ratePerUnit);
  System.out.println("Total Bill      : " + calculateBill());
}
}

class Test
{
  public static void main(String[] args)
   {
       // using default constructor
        ElectricityBill b1 = new ElectricityBill();
        b1.display();

        // using parameterized constructor
        ElectricityBill b2 = new ElectricityBill("Rahul", 101, 250);
        b2.display();

        // changing rate (static)
        ElectricityBill.changeRate(10.0);

        // display again after rate change
        b1.display();
        b2.display();
    }
}
     

   
