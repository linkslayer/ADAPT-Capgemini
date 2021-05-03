import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Source 
{
	 String[][] toys=new String[5][5];
	Source()
	{
	toys[0][0]="1";
	toys[0][1]="Stickle Bricks";
	
	toys[1][0]="2";
	toys[1][1]="Robot Dog";
	
	toys[2][0]="3";
	toys[2][1]="Magic 8 Ball";
	
	toys[3][0]="4";
	toys[3][1]="Juggling Clubs";
	
	toys[4][0]="5";
	toys[4][1]="Chutes and Ladders";
	}

public  String getToy(int age)
{
    String s ="";
    switch (age){
        case 1:
             s = toys[0][1];
             break;
        case 2:
             s = toys[1][1];
             break;
        case 3:
             s = toys[2][1];
             break;
        case 4:
             s = toys[3][1];
             break;
        case 5:
             s = toys[4][1];
             break;
        default:
            s= "No Toys Available";
            break;
    }
    return s;
        
}
	
    public static void main( String[] args )
	{
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    Source s= new Source();
	    System.out.println(s.getToy(n));
	    
	}
}
		 
