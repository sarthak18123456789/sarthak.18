class Farmer
	{
		int farmerid;
		String farmername;
		int landarea;
		double annualincome;
		int noofequipment;
		
		// Default constructor
		
		Farmer()
		{
			this.farmerid=101;
			this.farmername="omkar";
			this.landarea=1230;
			this.annualincome=30000;
			this.noofequipment=100;
			
		}// Default constructor end
		
		// Parameterized constructor
		Farmer(int farmerid,String farmername,int landarea,double annualincome,int noofequipment)
		{  
			this.farmerid=farmerid;
			this.farmername=farmername;
			this.landarea=landarea;
			this.annualincome=annualincome;
			this.noofequipment=noofequipment;
		}// Parameterized constructor end

		int getFarmerid() {
			return farmerid;
		}

		void setFarmerid(int farmerid) {
			this.farmerid = farmerid;
		}

		String getFarmername() {
			return farmername;
		}

		void setFarmername(String farmername) {
			this.farmername = farmername;
		}

		int getLandarea() {
			return landarea;
		}

		void setLandarea(int landarea) {
			this.landarea = landarea;
		}

		double getAnnualincome() {
			return annualincome;
		}

		void setAnnualincome(double annualincome) {
			this.annualincome = annualincome;
		}

		int getNoofequipment() {
			return noofequipment;
		}

		void setNoofequipment(int noofequipment) {
			this.noofequipment = noofequipment;
		}
		
		void display()
		{
			System.out.println("Farmer id is: " +this.farmerid);
			System.out.println("Farmer name is: " +this.farmername);
			System.out.println("Farmer landArea is: " +this.landarea);
			System.out.println("Farmer annualincome is: " +this.annualincome);
			System.out.println("Farmer noofequipment is: " +this.noofequipment);
		}
		
		

	}

	//--------------DairyFarmer--------------
	class DairyFarmer extends Farmer
	{
		int noofcatteles;
		double milkproduceperday;
		double dairylicenceno;
		
		// Default constructor
    
		DairyFarmer()
		{
			super(101,"sarthak",1243,2000,36);
			this.noofcatteles=10;
			this.milkproduceperday=50;
			this.dairylicenceno=65236426;
		}// Default constructor end
		
		DairyFarmer(int noofcatteles,double milkproduceperday,double dairylicenceno)
		{
			super(101, "sarthak", 1243, 2000, 36);
			this.noofcatteles=noofcatteles;
			this.milkproduceperday=milkproduceperday;
			this.dairylicenceno=dairylicenceno;
		}// Default constructor end

		int getNoofcatteles() {
			return noofcatteles;
		}

		void setNoofcatteles(int noofcatteles) {
			this.noofcatteles = noofcatteles;
		}

		double getMilkproduceperday() {
			return milkproduceperday;
		}

		void setMilkproduceperday(double milkproduceperday) {
			this.milkproduceperday = milkproduceperday;
		}

		double getDairylicenceno() {
			return dairylicenceno;
		}

		void setDairylicenceno(double dairylicenceno) {
			this.dairylicenceno = dairylicenceno;
		}
		
		void display()
		{
			super.display();
			System.out.println("NO of catteles is: " +this.noofcatteles);
			System.out.println("milkproduceperday  is: " +this.milkproduceperday );
			System.out.println("dairylicenceno is: " +this.dairylicenceno);
		}//display end
		
	}//DairyFarmer end
	
	
	//-----------PoultryFarm---------
	
	class PoultryFarm extends Farmer
	{
		int noofchickens;
	    int noofsheds;
	    int eggsproducedperDay;
	    int shedcapacity;
	    
	 // Default constructor
	    PoultryFarm()
	    {
	    	super(101,"sarthak",1243,2000,36);
	    	this.noofchickens=30;
		    this.noofsheds=8;
		    this.eggsproducedperDay=90;
		    this.shedcapacity=30;
	    }// Default constructor end
	    
	 // Parameterized constructor
	    
	    PoultryFarm(int id, String name, double area,   double income, int equip,
                int chickens, int sheds, int eggs, int capacity)
	    {
	    	super(103,"Rohan",6745,5000,46);
	    	this.noofchickens = chickens;
	    	this.noofsheds= sheds;
	        this.eggsproducedperDay = eggs;
	        this.shedcapacity = capacity;
	    }//// Parameterized constructor end
	    
	    
	    
	    int getNoofchickens() {
			return noofchickens;
		}

		void setNoofchickens(int noofchickens) {
			this.noofchickens = noofchickens;
		}

		int getNoofsheds() {
			return noofsheds;
		}

		void setNoofsheds(int noofsheds) {
			this.noofsheds = noofsheds;
		}

		int getEggsproducedperDay() {
			return eggsproducedperDay;
		}

		void setEggsproducedperDay(int eggsproducedperDay) {
			this.eggsproducedperDay = eggsproducedperDay;
		}

		int getShedcapacity() {
			return shedcapacity;
		}

		void setShedcapacity(int shedcapacity) {
			this.shedcapacity = shedcapacity;
		}

		void display() {
	        super.display();
	        System.out.println("Chickens: " + noofchickens);
	        System.out.println("Sheds: " + noofsheds);
	        System.out.println("Eggs/Day: " + eggsproducedperDay);
	        System.out.println("Shed Capacity: " + shedcapacity);
	    }//display end here
	    
	}//PoultryFarm end
	
	 	class SourceFarmer {
	    public static void main(String[] args) {
	        System.out.println("=== Dairy Farmer Details ===");
	        DairyFarmer df = new DairyFarmer();
	        df.display();

	        System.out.println("\n=== Poultry Farm Details ===");
	        PoultryFarm pf = new PoultryFarm();
	        pf.display();
	    }
	}
