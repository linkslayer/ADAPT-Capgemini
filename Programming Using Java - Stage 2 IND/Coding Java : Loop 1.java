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
	
		// Student Code Begin
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num>=1 && num <=999){
		    int[] bin = new int[40];
		    int index=0;
		    while(num>0){
		        bin[index] = num % 2;
		        num /= 2;
                        index++;
		    }
		    for(int i=index-1;i>=0;i--){
		        System.out.print(bin[i]);
		    } 
		}
		else{
		    System.out.println("INVALID_INPUT");
		}
		// Student Code end
    }
}
