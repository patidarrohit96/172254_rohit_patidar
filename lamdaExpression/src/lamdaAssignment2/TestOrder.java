package lamdaAssignment2;

public class TestOrder {

	public static void main(String[] args) 
	{
		Order o = price ->
      {
    	  if(price>10000)
    	  {
    		  System.out.println("accepted");
    	  }
    	  else
    	  {
    	  System.out.println("not accepted");
    	  }
      };
	
      o.order(9000);
      }
}


