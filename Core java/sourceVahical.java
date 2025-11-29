package Vahical;

public class Vahical
{
  String brand;
  String colour;
  int speed;
  double price;
  
//Default constructor
  
  Vahical()
  {
	  this.brand= "notgiven";
	  this.colour= "Black";
	  this.speed= 220;
	  this.price= 20000;
  }//Default constructor end
  
//Parameterized constructor
  
  Vahical(String brand,String color,int speed,double price )
  {
	  this.brand= brand;
	  this.colour= color;
	  this.speed= speed;
	  this.price= price;
  }//Parameterized constructor end

String getBrand() {
	return brand;
}

void setBrand(String brand) {
	this.brand = brand;
}

String getColour() {
	return colour;
}

void setColour(String colour) {
	this.colour = colour;
}

int getSpeed() {
	return speed;
}

void setSpeed(int speed) {
	this.speed = speed;
}

double getPrice() {
	return price;
}

void setPrice(double price) {
	this.price = price;
}
  
  void display()
  {
	  System.out.println("Brand name is: "+this.brand);
	  System.out.println("Color name is: "+this.colour);
	  System.out.println("Speed is: "+this.speed);
	  System.out.println("Price  is: "+this.price);
  }
  
}//Vahical end

class Car extends Vahical
{
	int noofdoors;
	boolean sunroof;
	int seatingcapacity;
	
	Car()
	{
		super();
		this.noofdoors=4;
		this.sunroof=true;
		this.seatingcapacity=5;
	}//Default constructor end
	
	//Parameterized constructor
	Car(String brand,String colour,int speed,double price,int noofdoors,boolean sunroof,int seatingcapacity)
	{
		super(brand,colour,speed,price);
		this.noofdoors=noofdoors;
		this.sunroof=sunroof;
		this.seatingcapacity=seatingcapacity;
	}//Parameterized constructor end
	
	void display()
	{
		super.display();
		System.out.println("No of doors: "+this.noofdoors);
		System.out.println("Sunroof available: "+this.sunroof);
		System.out.println("Seating capacity: "+this.seatingcapacity);
	}
}//Car end


//------------------ Bike Class ------------------
class Bike extends Vahical
{
	int enginecapacity;
	boolean hasabs;
	int gears;
	
	//Default constructor
	Bike()
	{
		super();
		this.enginecapacity=150;
		this.hasabs=true;
		this.gears=5;
	}//Default constructor end
	
	//Parameterized constructor
	Bike(String brand,String colour,int speed,double price,int enginecapacity,boolean hasabs,int gears)
	{
		super(brand,colour,speed,price);
		this.enginecapacity=enginecapacity;
		this.hasabs=hasabs;
		this.gears=gears;
	}//Parameterized constructor end
	
	void display()
	{
		super.display();
		System.out.println("Engine capacity: "+this.enginecapacity+" CC");
		System.out.println("Has ABS: "+this.hasabs);
		System.out.println("No of gears: "+this.gears);
	}
}//Bike end
//------------------ Bus Class ------------------
class Bus extends Vahical
{
	int seatingcapacity;
	String routename;
	boolean isAC;
	
	//Default constructor
	Bus()
	{
		super();
		this.seatingcapacity=50;
		this.routename="Not Given";
		this.isAC=true;
	}//Default constructor end
	
	//Parameterized constructor
	Bus(String brand,String colour,int speed,double price,int seatingcapacity,String routename,boolean isAC)
	{
		super(brand,colour,speed,price);
		this.seatingcapacity=seatingcapacity;
		this.routename=routename;
		this.isAC=isAC;
	}//Parameterized constructor end
	
	void display()
	{
		super.display();
		System.out.println("Seating capacity: "+this.seatingcapacity);
		System.out.println("Route name: "+this.routename);
		System.out.println("AC available: "+this.isAC);
	}
}//Bus end

class DemoInheritance
{
	public static void main(String[] args)
	{
		System.out.println("==== car===");
		Car c1=new Car("Tata","White",180,1500000,4,true,5);
		c1.display();
		
		System.out.println("==== Bike===");
		Bike b1=new Bike("Yamaha","Blue",160,120000,150,true,5);
		b1.display();
		
		System.out.println("==== Bus===");
		Bus bs1=new Bus("Volvo","Red",100,9500000,50,"Pune-Mumbai",true);
		bs1.display();
	}
}
