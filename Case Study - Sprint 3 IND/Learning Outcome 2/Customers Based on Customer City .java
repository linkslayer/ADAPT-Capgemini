import java.util.Scanner;

public class Source {
   static String[][] customerDetails = new String[5][3];
   public static String[] getCustomer(String city) {
      customerDetails[0][0] = "102";
      customerDetails[0][1] = "Krithick";
      customerDetails[0][2] = "Bangalore";

      customerDetails[1][0] = "105";
      customerDetails[1][1] = "Prabu";
      customerDetails[1][2] = "Chennai";

      customerDetails[2][0] = "252";
      customerDetails[2][1] = "Chandrav";
      customerDetails[2][2] = "Delhi";

      customerDetails[3][0] = "205";
      customerDetails[3][1] = "Kiran";
      customerDetails[3][2] = "Mumbai";

      customerDetails[4][0] = "202";
      customerDetails[4][1] = "Shravan";
      customerDetails[4][2] = "Pune";

      int low = 0;
      int high = customerDetails.length - 1;
      while (low <= high) {
         int mid = (low + high) / 2;
         if (customerDetails[mid][2].compareTo(city) == 0) {
            return customerDetails[mid];
         } else if (customerDetails[mid][2].compareTo(city) >= 0) {
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return null;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String city = in.nextLine();
      String cust[] = getCustomer(city);
      System.out.println(cust[0] + " " + cust[1] + " " + cust[2]);
   }
}
