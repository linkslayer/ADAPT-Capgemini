import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 1 && n <20){
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("MIN="+min);
            System.out.println("MAX="+max);
        }
        else{
            System.out.println("INVALID_INPUT");
        }
   }
}
