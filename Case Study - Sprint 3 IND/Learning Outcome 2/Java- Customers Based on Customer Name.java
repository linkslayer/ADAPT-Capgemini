import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source 
{
static String customerDetails[][]={{"105","Prabu","Chennai"},{"102","Krithick","Bangalore"},{"205","Kiran","Mumbai" },
			{"202", "Shravan", "Pune" },{"252","Chandrav","Delhi"}};
	
	static public String[] getCustomer(String name)
	{
	    for(int i=0;i<customerDetails.length;i++){
	        if(customerDetails[i][1].compareTo(name) == 0)
	            return customerDetails[i];
	    }
	    return null;
	}	

    public static void main( String[] args )
	{
	    Scanner in = new Scanner(System.in);
	    String name = in.nextLine();
	    String[] cust = Source.getCustomer(name);
	    System.out.println(cust[0]+" "+cust[1]+" "+cust[2]);
	}
}
		 
