class Employee
{
    private String name;
    private double basicSalary;

    // static variable
    private static double companyBonusRate = 10.0;

    // Default Constructor
    Employee()
    {
        this.name = "Sarthak";
        this.basicSalary = 2000;
    }

    // Parameterized Constructor
    Employee(String name, double basicSalary)
    {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Static Method to Change Bonus Rate
    public static void changeBonusRate(double newRate)
    {
        companyBonusRate = newRate;
    }

    // Getters and Setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }

    public static double getCompanyBonusRate()
    {
        return companyBonusRate;
    }

    // Non-static method to calculate total salary
    public double calculateTotalSalary()
    {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }

    public void display()
    {
        System.out.println("Employee Name     : " + name);
        System.out.println("Basic Salary      : " + basicSalary);
        System.out.println("Bonus Rate (%)    : " + companyBonusRate);
        System.out.println("Total Salary      : " + calculateTotalSalary());
        System.out.println("-------------------------------------------");
    }
}


class TestEmployee
{
    public static void main(String[] args)
    {
        // Using default constructor
        Employee e1 = new Employee();
        e1.display();

        // Using parameterized constructor
        Employee e2 = new Employee("Sarthak", 25000);
        e2.display();

        // Change static bonus rate
        Employee.changeBonusRate(20.0);

        // Display again after rate change
        e1.display();
        e2.display();
    }
}