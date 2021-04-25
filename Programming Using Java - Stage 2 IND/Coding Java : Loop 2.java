import java.util.Scanner;

/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
    	// Student Code begins
    	Scanner in = new Scanner(System.in);
    	int r1 = in.nextInt();
    	int r2 = in.nextInt();
    	int sum=0;
    	if(r1>=3 && r2<=1000 && r1<r2){
    	    for(int i=r1;i<r2;i++){
    	        int count=0;
    	        for(int j=1;j<r2;j++){
    	            if (i%j==0){
    	                count++;
    	            }
    	        }
    	        if(count==2){
    	            sum+=i;
    	        }
    	    }
    	    System.out.println(sum);
    	}
    	else{
    	    System.out.println("INVALID_INPUT");
    	}
    	// Student Code ends
    }
}
