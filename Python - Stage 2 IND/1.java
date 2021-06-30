import java.util.*;

public class Main{
	static Scanner in = new Scanner(System.in);
	static void driver(int c) {
		switch(c) {
		case 1:
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			mult();
			break;
		case 4:
			div();
			break;
		case 5:
			modulo();
			break;
		case 6:
			power();
			break;
		case 7:
			square();
			break;
		case 8:
			square_root();
			break;
		case 9:
			System.exit(0);
		default:
			System.out.println("Incorrect Choice, Enter from menu");
			break;
	}
	}
	
	static void printer() {
		System.out.println("\nBASIC CALCULATOR: \n");
		System.out.print("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULO\n6.POWER\n7.SQAURE\n8.SQUARE ROOT\n9.EXIT\n\nENTER YOUR CHOICE:\n");
	}
	
	static void print_num_statement() {
		System.out.println("Enter Two Numbers:");
	}
	
	static int[] getInput() {
		int[] n = new int[2];
        n[0] = in.nextInt();
        n[1] = in.nextInt();
        return n;
	}
	
	static void addition() {
		print_num_statement();
		int[] n = getInput();
		System.out.println("\nADDITION: "+n[0]+"+"+n[1]+"="+(n[0]+n[1]));
		
	}
	
	static void subtraction() {
		print_num_statement();
		int[] n = getInput();
		System.out.println("\nSUBTRACTION: "+n[0]+"-"+n[1]+"="+(n[0]-n[1]));
		
	}
	
	static void mult() {
		print_num_statement();
		int[] n = getInput();
		System.out.println("\nMULTIPLICATION: "+n[0]+"*"+n[1]+"="+(n[0]*n[1]));
		
	}
	
	static void div() {
		print_num_statement();
		int[] n = getInput();
		System.out.println("\nDIVISION: "+n[0]+"/"+n[1]+"="+(n[0]/n[1]));
		
	}
	
	static void modulo() {
		print_num_statement();
		int[] n = getInput();
		System.out.println("\nMODULO: "+n[0]+"%"+n[1]+"="+(n[0]%n[1]));
	}
	
	static void power() {
		System.out.println("Enter Number and Power\n");
		int[] n = getInput();
		System.out.println("\nPOWER: "+n[0]+"^"+n[1]+"="+(Math.pow(n[0], n[1])));
	}
	
	static void square() {
		System.out.println("\nEnter a number: ");
		int n = in.nextInt();
		System.out.println("\nSQUARE: "+n+"*"+n+"="+(n*n));
	}
	
	static void square_root() {
		System.out.println("\nEnter a number: ");
		int n = in.nextInt();
		System.out.println("\nSQUARE ROOT: "+n+"="+(Math.sqrt(n)));
	}
	
	public static void main(String[] args) {
		int c;
		char ch;
		do {
			printer();
			c = in.nextInt();
			driver(c);
			System.out.println("\nUse Again? YES(Y)/NO(N)");
			ch = in.next().charAt(0);
		}while(ch!='N' || ch!='n');
	}
}
