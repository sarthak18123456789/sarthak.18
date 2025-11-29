package Shap;

public class Shap 
{
	String name;
	double area;
	double perimeter;
	String type;
	
	// Default constructor
	Shap()
	{
		this.name="not given";
		this.area=3.3;
		this.perimeter=4.3;
		this.type="Geometrical";
		}// Default constructor end
	
	
	// Parameterized constructor
	Shap(String name,double area,double perimeter,String type)
	{
		this.name=name;
		this.area=area;
		this.perimeter=perimeter;
		this.type=type;
		}// Parameterized constructor end


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	double getArea() {
		return area;
	}


	void setArea(double area) {
		this.area = area;
	}


	double getPerimeter() {
		return perimeter;
	}


	void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	String getType() {
		return type;
	}


	void setType(String type) {
		this.type = type;
	}
	
	void display()
	{
		System.out.println("Name is:"+this.name);
		System.out.println("area is:"+this.area);
		System.out.println("perimeter is:"+this.perimeter);
		System.out.println("type is:"+this.type);
	}//display end

}//Shap end here

class Circle extends Shap
{
	double radius;
	
	// Default constructor
	Circle()
	{
	super();
	this.radius=4.7;
	}// Default constructor end
	
	// Parameterized constructor
	Circle(String name,double area,double perimeter,String type,double radius)
	{
		super( name, area, perimeter, type);
		this.radius=radius;
	}// Parameterized constructor end

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void display()
	{
		super.display();
		System.out.println("Radius is: "+this.radius);
	}//display end here
	
}//Circle end

//------------------ Rectangle Class ------------------
class Rectangle extends Shap
{
	double length;
	double width;
	
	// Default constructor
	Rectangle()
	{
		super();
		this.length=10.0;
		this.width=5.0;
	}// Default constructor end
	
	// Parameterized constructor
	Rectangle(String name,String colour,double area,double perimeter,String type,double length,double width)
	{
		super(name, colour, area, perimeter, type);
		this.length=length;
		this.width=width;
	}// Parameterized constructor end
	
	void display()
	{
		super.display();
		System.out.println("Length: "+this.length);
		System.out.println("Width: "+this.width);
	}
}//Rectangle end


//------------------ Triangle Class ------------------
class Triangle extends Shap
{
	double base;
	double height;
	double side;
	
	// Default constructor
	Triangle()
	{
		super();
		this.base=6.0;
		this.height=8.0;
		this.side=5.0;
	}// Default constructor end
	
	// Parameterized constructor
	Triangle(String name,String colour,double area,double perimeter,String type,double base,double height,double side)
	{
		super(name,colour,area,perimeter,type);
		this.base=base;
		this.height=height;
		this.side=side;
	}// Parameterized constructor end
	
	void display()
	{
		super.display();
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
		System.out.println("Side: "+this.side);
	}
}//Triangle end

class DemoInheritance
{
	public static void main(String[] args)
	{
		System.out.println("====Circle Detail====");
		Circle c1=new Circle();
		c1.display();
		
		System.out.println("====Rectangle  Detail====");
		Rectangle r1=new Rectangle ();
		r1.display();
		
		System.out.println("====Triangle Detail====");
		Triangle t1=new Triangle ();
		t1.display();
		
	}
}
