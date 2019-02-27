package pojo;

public class UserAccount {
	 
//	   public static final String GENDER_MALE ="M";
//	   public static final String GENDER_FEMALE = "F";
//	    
	   private String email;
	   private String password;
	 //  private String gender;
	   
	    
	 
	   public UserAccount(String email,  String password) {
		super();
		this.email = email;
		this.password = password;
		
	}

	public UserAccount(String userName) {
		super();
		this.email = userName;
	}

	public UserAccount() {
	        
	   }
	    	
	   public String getEmail() {
	       return email;
	   }
	 
	   public void setEmail(String userName) {
	       this.email = email;
	   }
	 

	   public String getPassword() {
	       return password;
	   }
	 
	   public void setPassword(String password) {
	       this.password = password;
	   }
	   

	 
	}