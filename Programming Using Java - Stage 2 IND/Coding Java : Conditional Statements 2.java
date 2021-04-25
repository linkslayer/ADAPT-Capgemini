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
	// Student code begins
	Scanner in = new Scanner(System.in);
	int s1 = in.nextInt();
	int s2 = in.nextInt();
	int s3 = in.nextInt();
	if (s1>s2 && s2>s3){
	    int sos = s2*s2 + s3*s3;
	    int check = s1*s1;
	    if (sos==check){
	        System.out.println("RIGHT ANGLE");
	    }
	    else{
	        System.out.println("NOT RIGHT ANGLE");
	    }
	}
	else{
	    System.out.println("INVALID_INPUT");
	}
	// Student code ends;
    }
}
