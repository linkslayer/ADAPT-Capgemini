import java.util.Scanner;

public class Source {
	public  String customerArray[][]=new String[5][3];
	
	public void createCustomer(String[][] array)
	{
		// your code here
		this.customerArray = array;
	}
	
	public  String[][] getCustomers()
	{
	    for (int i = 0; i < customerArray.length; i++) {
         for (int j = 0; j < (customerArray.length - i - 1); j++) {
            int id1 = Integer.parseInt(customerArray[j][0]);
            int id2 = Integer.parseInt(customerArray[j + 1][0]);
            if (id1 > id2) {
               String temp[] = customerArray[j + 1];
               customerArray[j + 1] = customerArray[j];
               customerArray[j] = temp;
            }
         }
      }
      return customerArray;
	}
	public static void main(String args[])
	{
	  Scanner in = new Scanner(System.in);
	  String[][] customerDetails = new String[5][3];
	  for(int i=0;i<5;i++)
	    for(int j=0;j<3;j++)
	        customerDetails[i][j] = in.nextLine();
	   Source c = new Source();
	   c.createCustomer(customerDetails);
	   String[][] gc = c.getCustomers();
	   for (String[] cust : gc)
         System.out.println(cust[0] + " " + cust[1] + " " + cust[2] + " ");
    }
}
