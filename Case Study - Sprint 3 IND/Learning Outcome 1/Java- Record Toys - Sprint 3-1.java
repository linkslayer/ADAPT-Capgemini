import java.util.*;

public class Source {
	public static String[] getToys(String[] input)
    {
        Arrays.sort(input);
        return input;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] input = new String[4];
        for(int i=0;i<4;i++)
            input[i] = in.nextLine();
        String[] actual = Source.getToys(input);
         for(int i=0;i<4;i++)
             System.out.println(actual[i]);
    }

}
