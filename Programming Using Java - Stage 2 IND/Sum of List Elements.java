import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Source {
	public List<Integer> getSumOfListElements(List<Integer> first,List<Integer> second){
	    //CODE HERE
	    List<Integer> sum=new ArrayList<Integer>();
        int n;
        if(first.size()>second.size()){
            n=first.size();
            sum=first;
        }
        else{
            n=second.size();
            sum=second;
        }
        for(int i=0;i<(n-Math.abs(first.size()-second.size()));i++){
            sum.set(i,first.get(i)+second.get(i));
        }
        return sum;
	}

	public static void main(String[] args) {
	    //CODE HERE
	    Scanner sc=new Scanner(System.in);
        Source src=new Source();
        String str1,str2;
        str1=sc.nextLine();
        str2=sc.nextLine();
        if(str1.length()!=0 && str2.length()!=0){
            String input[]=str1.split(", ");
            List<Integer> al1=new ArrayList<Integer>();
            List<Integer> al2=new ArrayList<Integer>();
            List<Integer> sum=new ArrayList<Integer>();
            for(int i=0;i<input.length;i++)
                al1.add(Integer.parseInt(input[i]));
            input=str2.split(", ");
            for(int i=0;i<input.length;i++)
                al2.add(Integer.parseInt(input[i]));
            sum=src.getSumOfListElements(al1,al2);
            System.out.print("[");
            for(int i=0;i<sum.size()-1;i++)
                System.out.print(sum.get(i)+", ");
            System.out.print(sum.get(sum.size()-1)+"]");
        }
	} 
}
