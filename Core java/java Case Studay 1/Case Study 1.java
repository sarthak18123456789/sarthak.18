package p1;

import java.util.Scanner;
public class BankAccount {
static int nextAccountNumber = 101;
	
	int accountNumber;
	String accountType;
	double Balance;
	String  aadharNo;
	String  panNumber;
	
	
	BankAccount(){ //Default constructor 
		this.accountNumber = nextAccountNumber++;
		this.accountType = "HDFC";
		this.Balance = 0.0;
		this.aadharNo = "N/A";
		this.panNumber = "N/A";

	}
	
	BankAccount(int accountNumber , String accountType , double Balance , String aadharNo , String panNumber){ //Parameterized constructor 
		this.accountNumber = nextAccountNumber++ ;
		this.accountType = accountType;
		this.Balance = Balance ;
		this.aadharNo = aadharNo;
		this.panNumber = panNumber;
	}
	
     int getAccountNumber() { //setter getter method 
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	 String getAccountType() {
		return accountType;
	}

	 void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	 double getBalance() {
		return Balance;
	}

	 void setBalance(double balance) {
		Balance = balance;
	}

	 String getAadharNo() {
		return aadharNo;
	}

	 void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	 String getPanNumber() {
		return panNumber;
	}

	 void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
		
	void deposit(double ammount) { //DEPOSIT AMMOUNT METHOD 
		if(ammount > 0) {
			Balance += ammount ;
		}
		else {
			System.out.println("Invalid Deposit Ammount");
		}
	}
	
	void withdrow(double ammount) { //WITHROW AMMOUNT METHOD 
		if(ammount > 0 && ammount <= Balance) {
			Balance -= ammount;
		}
		else {
			System.out.println("Insifiend Balanace");
		}
	}
	
	double checkBalance () { //CHECK BALANCE METHOD 
		return Balance;
	}
	
	void applayIntrest() { //APPLY INTREST 
		double intrest = Balance *0.03;
		Balance += intrest ;
	}
	
	void getAccountDetails() {
		display();
	}
	
	void display() {
		System.out.println("Bank Accont Deatils");
		System.out.println("Account Number is : " +accountNumber);
		System.out.println("Account Type is : " + accountType);
		System.out.println("Balance is : " + Balance);
		System.out.println("Aadhar no is : " + aadharNo);
		System.out.println("Pan No is : " + panNumber);
	}
} //Bank Account class ends here 
 
 
 //SAVING CLASS START HERE 
class SavingAccount extends BankAccount
 {
   double minBalance;
   double withdrawLimit;
   double dailyLimit;

 //default constructor 
 SavingAccount()
 {
 super();
   this.minBalance=1000;
   this.withdrawLimit=20000;
   this.dailyLimit=20000;
 }

 //Parameterized constructor
 SavingAccount(double minBalance, double withdrawLimit, double dailyLimit )
 {
 super();
   this.minBalance=minBalance;
   this.withdrawLimit=withdrawLimit;
   this.dailyLimit=dailyLimit;
 }//Parameterized constructor

 // Getter and Setter for minBalance
    double getMinBalance() {
       return minBalance;
   }
    void setMinBalance(double minBalance) {
       this.minBalance = minBalance;
   }

   // Getter and Setter for withdrawLimit
    double getWithdrawLimit() {
       return withdrawLimit;
   }
    void setWithdrawLimit(double withdrawLimit) {
       this.withdrawLimit = withdrawLimit;
   }

   // Getter and Setter for dailyLimit
    double getDailyLimit() {
       return dailyLimit;
   }
    void setDailyLimit(double dailyLimit) {
       this.dailyLimit = dailyLimit;
   }

 void display() //Display the Saving account value 
 {
 super.display();
 System.out.println("minimum blance is: "+this.minBalance);
 System.out.println("withdraw Limit  is: "+this.withdrawLimit);
 System.out.println("daily Limit is: "+this.dailyLimit);
 	}//display end here
 }
//SAVING CLASS ENDS HERE 
  

//LOAN CLASS START 
 class LoanAccount extends BankAccount
  {
   float LoneInterstrate;
   double LoneAmount;
   int LoneId;
   double LastPaymentDate; 

  // default constructor
      LoanAccount()
      {
          super();
          this.LoneInterstrate = 0;
          this.LoneAmount = 0.0;
          this.LoneId = 0;
          this.LastPaymentDate = 0.0;
      }

      // parameterized constructor
      LoanAccount(float LoneInterstrate, double LoneAmount, int LoneId, double LastPaymentDate)
      {
          super();
          this.LoneInterstrate = LoneInterstrate;
          this.LoneAmount = LoneAmount;
          this.LoneId = LoneId;
          this.LastPaymentDate = LastPaymentDate;
      }

      // Getter and Setter for LoneInterstrate
       float getLoneInterstrate() {
          return LoneInterstrate;
      }
       void setLoneInterstrate(float LoneInterstrate) {
          this.LoneInterstrate = LoneInterstrate;
      }

      // Getter and Setter for LoneAmount
       double getLoneAmount() {
          return LoneAmount;
      }
       void setLoneAmount(double LoneAmount) {
          this.LoneAmount = LoneAmount;
      }

      // Getter and Setter for LoneId
       int getLoneId() {
          return LoneId;
      }
       void setLoneId(int LoneId) {
          this.LoneId = LoneId;
      }

      // Getter and Setter for LastPaymentDate
       double getLastPaymentDate() {
          return LastPaymentDate;
      }
       void setLastPaymentDate(double LastPaymentDate) {
          this.LastPaymentDate = LastPaymentDate;
      }

      // display method
       void display()
      {
          System.out.println("LoneInterstrate : " + LoneInterstrate);
          System.out.println("LoneAmount : " + LoneAmount);
          System.out.println("LoneId : " + LoneId);
          System.out.println("LastPaymentDate : " + LastPaymentDate);
      }
  }
//LOAN ACCOUNT ENDS HERE 
   
//SALARY ACCOUNT START HERE
class SalaryAccount extends BankAccount
   {
       double SalaryAmount;
       double SalaryCreadit;
       double LastTransaction;

       // default constructor
       SalaryAccount()
       {
           super();
           this.SalaryAmount = 0.0;
           this.SalaryCreadit = 0.0;
           this.LastTransaction = 0.0;
       }

       // parameterized constructor
       SalaryAccount(double SalaryAmount, double SalaryCreadit, double LastTransaction)
       {
           super();
           this.SalaryAmount = SalaryAmount;
           this.SalaryCreadit = SalaryCreadit;
           this.LastTransaction = LastTransaction;
       }

       // Getter and Setter for SalaryAmount
        double getSalaryAmount() {
           return SalaryAmount;
       }
        void setSalaryAmount(double SalaryAmount) {
           this.SalaryAmount = SalaryAmount;
       }

       // Getter and Setter for SalaryCreadit
       public double getSalaryCreadit() {
           return SalaryCreadit;
       }
        void setSalaryCreadit(double SalaryCreadit) {
           this.SalaryCreadit = SalaryCreadit;
       }

       // Getter and Setter for LastTransaction
        double getLastTransaction() {
           return LastTransaction;
       }
        void setLastTransaction(double LastTransaction) {
           this.LastTransaction = LastTransaction;
       }

       // display method
       void display()
       {
           super.display();
           System.out.println("SalaryAmount : " + SalaryAmount);
           System.out.println("SalaryCreadit : " + SalaryCreadit);
           System.out.println("LastTransaction : " + LastTransaction);
       }
}
// SALARY ACCOUNT ENDS HERE  

//Transaction class start here 
class Transaction extends BankAccount
{
    int TransactionID;
    double Amount;
    int Date;
    double TrasnsactionCount;

    // default constructor
    Transaction()
    {
        super();
        this.TransactionID = 0;
        this.Amount = 0.0;
        this.Date = 0;
        this.TrasnsactionCount = 0.0;
    }

    // parameterized constructor
    Transaction(int TransactionID, double Amount, int Date, double TrasnsactionCount)
    {
        super();
        this.TransactionID = TransactionID;
        this.Amount = Amount;
        this.Date = Date;
        this.TrasnsactionCount = TrasnsactionCount;
    }

    // Getter and Setter for TransactionID
     int getTransactionID() {
        return TransactionID;
    }
     void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    // Getter and Setter for Amount
     double getAmount() {
        return Amount;
    }
     void setAmount(double Amount) {
        this.Amount = Amount;
    }

    // Getter and Setter for Date
     int getDate() {
        return Date;
    }
    public void setDate(int Date) {
        this.Date = Date;
    }

    // Getter and Setter for TrasnsactionCount
     double getTrasnsactionCount() {
        return TrasnsactionCount;
    }
     void setTrasnsactionCount(double TrasnsactionCount) {
        this.TrasnsactionCount = TrasnsactionCount;
    }

    // display method
    void display()
    {
        super.display();
        System.out.println("TransactionID : " + TransactionID);
        System.out.println("Amount : " + Amount);
        System.out.println("Date : " + Date);
        System.out.println("TrasnsactionCount : " + TrasnsactionCount);
    }
}
//Transaction class ends here 

//Business class start here 
	class current extends BankAccount {
		String  businessName;
		double overdraftlimit;
		double overdraftUsed;
		double overdraffinterest;
		double overdraftRepaid;
  
  current(){ //Default constructor 
	  super();
		this.businessName = "Account";
		this.overdraftlimit = 0;
		this.overdraftUsed = 0;
		this.overdraffinterest = 2;
		this.overdraftRepaid = 0;
  }
  
  //Parameterized constructor
  current(String n, double limit , double Used , double interest , double repaid ){
	    super();  // correct
	    this.businessName = n;
	    this.overdraftlimit = limit;
	    this.overdraftUsed = Used;
	    this.overdraffinterest = interest;
	    this.overdraftRepaid = repaid;
	}

  //setter method use here 
  	void  setbusinessName() {
	  this.businessName = "null";
  		}
  
  	void setoverdraftlimit () {
	  this.overdraftlimit = 0;
  		}
  
  	void setoverdraftUsed () {
	  this.overdraftUsed= 0;
  		}
  
  
  	void setoverdraffinterest() {
	  this.overdraffinterest= 3;
  		}
  
  	void setoverdraftRepaid() {
	this.overdraftRepaid = 0;
  		}

  	//Getter method use here 
	String getBusinessName() {
	return businessName;
		}

	double getoverdraftlimit() {
	return overdraftlimit;
		}

	double getoverdraftUsed() {
	return overdraftUsed;
		}

	double getoverdraffinterest() {
	return overdraffinterest;
		}

	double getoverdraftRepaid() {
		return overdraftRepaid;
		}
	
	//display the current class 
	void display() {
	super.display();
	System.out.println("businessName : " + this. businessName);
	System.out.println("overdraftlimit; : " + this. overdraftlimit);
	System.out.println("overdraftUsed; : " + this.overdraftUsed );
	System.out.println("overdraffinteres : " + this.overdraffinterest);
	System.out.println("overdraftRepaid: " + this.overdraftRepaid);
		} 
	}

//Bank class ends here 

	
//ClASS RUN HERE 
class TestBank{
	public static void main(String[] args) {
		
		//USE SCANNER KEY TO TAKE VALUE FROM USER 
		
		 Scanner sc = new Scanner(System.in);

//BANK ACCOUNT 
	        System.out.println("\n Enter BankAccount Details");
	        System.out.print("Enter Account Type : ");
	        String type = sc.next();

	        System.out.print("Enter Balance: ");
	        double bal = sc.nextDouble();

	        System.out.print("Enter Aadhar No : ");
	        String aad = sc.next();

	        System.out.print("Enter Pan No : ");
	        String pan = sc.next();

	        BankAccount B1 = new BankAccount(101, type, bal, aad, pan);
	        B1.display();


//SAVING ACCOUNT
	        System.out.println("\n Enter SavingAccount Details");
	        System.out.print("Enter Minimum Balance : ");
	        double minB = sc.nextDouble();

	        System.out.print("Enter Withdraw Limit : ");
	        double wLimit = sc.nextDouble();

	        System.out.print("Enter Daily Limit : ");
	        double dLimit = sc.nextDouble();

	        SavingAccount S1 = new SavingAccount(minB, wLimit, dLimit);
	        S1.display();


//LOAN ACCOUNT 
	        System.out.println("\n Enter LoanAccount Details");
	        System.out.print("Enter Loan Interest Rate : ");
	        float rate = sc.nextFloat();

	        System.out.print("Enter Loan Amount : ");
	        double loanAmt = sc.nextDouble();

	        System.out.print("Enter Loan ID : ");
	        int lid = sc.nextInt();

	        System.out.print("Enter Last Payment Date (yyyymmdd) : ");
	        double lpdate = sc.nextDouble();

	        LoanAccount L1 = new LoanAccount(rate, loanAmt, lid, lpdate);
	        L1.display();

//SALARY ACCOUNT 
	        System.out.println("\n Enter SalaryAccount Details");
	        System.out.print("Enter Salary Amount : ");
	        double salAmt = sc.nextDouble();

	        System.out.print("Enter Salary Credit : ");
	        double credit = sc.nextDouble();

	        System.out.print("Enter Last Transaction Date (yyyymmdd) : ");
	        double tdate = sc.nextDouble();

	        SalaryAccount SA1 = new SalaryAccount(salAmt, credit, tdate);
	        SA1.display();


//TRANSACTION 
	        System.out.println("\n Enter Transaction Details");
	        System.out.print("Enter Transaction ID: ");
	        int tid = sc.nextInt();

	        System.out.print("Enter Transaction Amount : ");
	        double amt = sc.nextDouble();

	        System.out.print("Enter Transaction Date : ");
	        int tdt = sc.nextInt();

	        System.out.print("Enter Transaction Count : ");
	        double tcount = sc.nextDouble();

	        Transaction T1 = new Transaction(tid, amt, tdt, tcount);
	        T1.display();

 //BUSINESS CURRENT ACCOUNT 
	        System.out.println("\n Enter Current Account Details");
	        System.out.print("Enter Business Name : ");
	        String bname = sc.next();

	        System.out.print("Enter Overdraft Limit : ");
	        double odLimit = sc.nextDouble();

	        System.out.print("Enter Overdraft Used :  ");
	        double odUsed = sc.nextDouble();

	        System.out.print("Enter Overdraft Interest :  ");
	        double odInt = sc.nextDouble();

	        System.out.print("Enter Overdraft Repaid :  ");
	        double odRepay = sc.nextDouble();

	        current C1 = new current(bname, odLimit, odUsed, odInt, odRepay);
	        C1.display();

	        sc.close();
	}//MAIN ENDS HERE
}//CLASS TEST ENDS HERE


