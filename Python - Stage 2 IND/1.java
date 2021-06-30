
import java.util.Scanner;

public class Main {
	static int randGen(int n) {
		n = 1 + (int)(n* Math.random());
		return n;
	}
	static int diff(int r,int guess) {
		if(r>guess)
			return r-guess;
		else
			return guess-r;
	}
	static int menu(int score) {
		System.out.println("NUMBER GUESSING GAME\n");
		System.out.println("Score: "+score);
		System.out.println("\nChoose Range-\n1. 1-10\n2. 1-100\nEnter your choice:");
		int ch = in.nextInt();
		int max;
		if (ch==1) {
			max = 10;
		} else {
			max=100;
		}
		return max;
		
	}
	static int checkActualNumber() {
		int guess;
		do {
			System.out.println("Enter Guess input: ");
			guess = in.nextInt();
		}while(guess!=(int)guess);
		return guess;
	}
	static boolean checker(int r, int guess) {
		if(r==guess)
			return true;
		else
			return false;
		
	}
	static void hints(int r, int guess) {
		System.out.println("HINT 1: The diffrence between the Random and Guess number: "+guess+" is: "+diff(r, guess));
		if(r>guess)
			System.out.println("HINT 2: The random number is greater than " + guess);
		else
			System.out.println("HINT 2: The random number is less than " + guess);
		if(r%2==0) 
			System.out.println("HINT 3: The random number is even");
		else
			System.out.println("HINT 3: The random number is odd");
	}
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char choice;
		int score = 5;
		do {
			int max=menu(score);
			int r = randGen(max);
			System.out.println("\nRANDOM NUMBER GENERATED\n");
			boolean condition=true;
			do {
				int guess = checkActualNumber();
				if(checker(r, guess)) {
					System.out.println("Correct!!! You WON!!!\nThe number was: "+guess);
					System.out.println("Score will be increased by 5 points");
					score += 5;
					condition=false;
				}else {
					char h;
					System.out.println("OOPS!!! Wrong Number\nNeed hints?\nThis will decrease your score by 2\nYes(Y)/No(N)");
					h=in.next().charAt(0);
					if(Character.toUpperCase(h)=='Y'){
						score -= 2;
						hints(r, guess);
					}
					else {
						System.out.println("Try Again!\n");
					}
				}
			}while(condition);
			System.out.println("\nPlay Again?YES(Y)/NO(N)");
			choice = in.next().charAt(0);
		}while(Character.toUpperCase(choice)!='N');
		
	}

}
