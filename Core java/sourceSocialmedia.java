package socialmedia;

public class SocialmediaAccount
{
	String username;
	String email;
    boolean ispublic;
    boolean isverified;
    int noofposts;
    int nooflikes;
    int noofcomments;
    
    
    // Default Constructor
    SocialmediaAccount()
    {
    this.username="Omkar123";
	this.email="user123@example.com";
    this.ispublic=true;
    this.isverified=false;
    this.noofposts=10;
    this.nooflikes=500;
    this.noofcomments=100;
    }// Default Constructor end
    
    
 // Parameterized Constructor
    SocialmediaAccount(String username, String email, boolean ispublic, boolean isverified,
            int noofposts, int nooflikes,
            int noofcomments )
    {
    this.username=username;
	this.email=email;
    this.ispublic=ispublic;
    this.isverified=isverified;
    this.noofposts=noofposts;
    this.nooflikes=nooflikes;
    this.noofcomments=noofcomments;
    }// Parameterized Constructor end


	String getUsername() {
		return username;
	}


	void setUsername(String username) {
		this.username = username;
	}


	String getEmail() {
		return email;
	}


	void setEmail(String email) {
		this.email = email;
	}


	boolean isIspublic() {
		return ispublic;
	}


	void setIspublic(boolean ispublic) {
		this.ispublic = ispublic;
	}


	boolean isIsverified() {
		return isverified;
	}


	void setIsverified(boolean isverified) {
		this.isverified = isverified;
	}


	int getNoofposts() {
		return noofposts;
	}


	void setNoofposts(int noofposts) {
		this.noofposts = noofposts;
	}


	int getNooflikes() {
		return nooflikes;
	}


	void setNooflikes(int nooflikes) {
		this.nooflikes = nooflikes;
	}


	int getNoofcomments() {
		return noofcomments;
	}


	void setNoofcomments(int noofcomments) {
		this.noofcomments = noofcomments;
	}
    
    void display()
    {
    	System.out.println("Username: "+this.username);
    	System.out.println("email: "+this.email);
    	System.out.println("ispublic: "+this.ispublic);
    	System.out.println("isverified: "+this.isverified);
    	System.out.println("noofposts: "+this.noofposts);
    	System.out.println("nooflikes: "+this.nooflikes);
    	System.out.println("noofcomments: "+this.noofcomments);
    }//display end here
    
}//SocialmediaAccount end
 // ---------- InstagramAccount ----------
    
    class InstagramAccount extends SocialmediaAccount
    {
    	 int nooffollowers;
         int nooffollowing;
         int noofhighlights;
         int noofaudioSaved;
         
      // Default Constructor
         InstagramAccount()
         {
        	 super("sarthak","user123@exampale.com",true,false,30,300,200);
        	 this.nooffollowers=1000;
        	 this.nooffollowing=900;
        	 this.noofhighlights=100;
         	 this.noofaudioSaved=30;
         }// Default Constructor end
         
      // Parameterized Constructor
    
         InstagramAccount(int nooffollowers,int nooffollowing,int noofhighlights,int noofaudioSaved)
         {
        	 super("user123", "user123@example.com", true, false, 30, 300, 200);
        	 this.nooffollowers=1000;
        	 this.nooffollowing=900;
        	 this.noofhighlights=100;
         	 this.noofaudioSaved=30;
         }// Parameterized Constructor end

		int getNooffollowers() {
			return nooffollowers;
		}

		void setNooffollowers(int nooffollowers) {
			this.nooffollowers = nooffollowers;
		}

		int getNooffollowing() {
			return nooffollowing;
		}

		void setNooffollowing(int nooffollowing) {
			this.nooffollowing = nooffollowing;
		}

		int getNoofhighlights() {
			return noofhighlights;
		}

		void setNoofhighlights(int noofhighlights) {
			this.noofhighlights = noofhighlights;
		}

		int getNoofaudioSaved() {
			return noofaudioSaved;
		}

		void setNoofaudioSaved(int noofaudioSaved) {
			this.noofaudioSaved = noofaudioSaved;
		}
         
         void display()
         {
        	 super.display();
        	 System.out.println("Followers: " +this.nooffollowers);
        	 System.out.println("Following: " + this.nooffollowing);
        	 System.out.println("Highlights: " + this.noofhighlights);
        	 System.out.println("AudioSaved: " + this.noofaudioSaved);
        	 
         }//display end
    }//InstagramAccount  end
    
 // ---------- YouTubeAccount ----------
    
    class YouTubeAccount extends SocialmediaAccount
    {
    	int noofsubscribers;
        double watchtime;
        boolean ismonetized;
        double estimatedrevenue;
        
     // Default Constructor
        
        YouTubeAccount()
        {
        	super("sarthak","user123@exampale.com",true,false,30,300,200);
        	this.noofsubscribers=500;
        	this.watchtime=2008.30;
        	this.ismonetized=true;
        	this.estimatedrevenue=13000.83;
        	
        } // Default Constructor end
        
     // Parameterized Constructor
        
        YouTubeAccount( String username, String email, boolean ispublic, boolean isverified,
                int noofposts, int nooflikes,
                int noofcomments,int noofsubscribers,double watchtime,boolean ismonetized,double estimatedrevenue) 
        {
        	super( username,  email,  ispublic,  isverified,
   	             noofposts,  nooflikes,
   	             noofcomments );
        	this.noofsubscribers=noofsubscribers;
        	this.watchtime=watchtime;
        	this.ismonetized=ismonetized;
        	this.estimatedrevenue=estimatedrevenue;
        }// Parameterized Constructor end
        
        
    }//YouTubeAccount end

 // ---------- LinkedInAccount ----------

    class LinkedInAccount extends SocialmediaAccount
    {
    	int noofconnections;
    	int noofprofileviews;
    	int noofjobsapplied;
    	
    	// Default Constructor
    	LinkedInAccount()
    	{
    		super("sarthak","user123@exampale.com",true,false,30,300,200);
    		this.noofconnections=800;
    		this.noofprofileviews=2000;
    		this.noofjobsapplied=15;
    	}// Default Constructor end
    	
    	
    	// Parameterized Constructor
    	LinkedInAccount(String username, String email, boolean ispublic, boolean isverified,
                int noofposts, int nooflikes, int noofcomments,
                int noofconnections, int noofprofileviews, int noofjobsapplied)
    	{
    		super(username, email, ispublic, isverified, noofposts, nooflikes, noofcomments);
    		this.noofconnections=noofconnections;
    		this.noofprofileviews=noofprofileviews;
    		this.noofjobsapplied=noofjobsapplied;
    	}// Parameterized Constructor end
    	
    	
    	int getNoofconnections() {
    		return noofconnections;
    	}
    	void setNoofconnections(int noofconnections) {
    		this.noofconnections = noofconnections;
    	}
    	
    	int getNoofprofileviews() {
    		return noofprofileviews;
    	}
    	void setNoofprofileviews(int noofprofileviews) {
    		this.noofprofileviews = noofprofileviews;
    	}
    	
    	int getNoofjobsapplied() {
    		return noofjobsapplied;
    	}
    	void setNoofjobsapplied(int noofjobsapplied) {
    		this.noofjobsapplied = noofjobsapplied;
    	}
    	
    	
    	void display()
    	{
    		super.display();
    		System.out.println("Connections: "+this.noofconnections);
    		System.out.println("ProfileViews: "+this.noofprofileviews);
    		System.out.println("JobsApplied: "+this.noofjobsapplied);
    	}// display end
    }// LinkedInAccount end
    
    class DemoInheritance 
    {
        public static void main(String[] args)
        {
            System.out.println("=== Instagram Account Details ===");
            InstagramAccount insta = new InstagramAccount();
            insta.display();

            System.out.println("\n=== YouTube Account Details ===");
            YouTubeAccount yt = new YouTubeAccount();
            yt.display();

            System.out.println("\n=== LinkedIn Account Details ===");
            LinkedInAccount li = new LinkedInAccount();
            li.display();
        }
    }
    