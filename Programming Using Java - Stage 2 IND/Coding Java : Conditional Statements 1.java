import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
	    int avg = (p+c+m)/3;
	    if (p<=100 && c<=100 && m<=100 && p>0 && c>0 && m>0){
	        if (avg >= 70){
	            System.out.println("DISTINCTION");
	        }
	        else if (avg >= 60){
	            System.out.println("FIRST");
	        }
	        else if (avg >= 50){
	            System.out.println("SECOND");
	        }
	        else if (avg >= 40){
	            System.out.println("THIRD");
	        }
	        else {
	            System.out.println("FAIL");
	        }
        }
	    else {
	    	System.out.println("INVALIDMARKS");
	    }
    }
}
