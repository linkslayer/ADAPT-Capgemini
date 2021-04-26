import java.util.Scanner;

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    	// Student code starts
    
    
    
    public static void main(String[] args) {
        // Student code ends
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = String.valueOf(n).length();
        if (l != 3){
            System.out.println("INVALID_INPUT");
        }
        else{
            int r,sum=0,on=n;
            while(n > 0){
                r = n%10;
                sum+=r*r*r;
                n/=10;
            }
            if(on == sum){
                System.out.println("ARMSTRONG");
            }
            else{
                System.out.println("NOT ARMSTRONG");
            }
        }
    }
}
