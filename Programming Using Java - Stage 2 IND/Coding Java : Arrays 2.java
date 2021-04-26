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
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>1 && n<20){
            int[] arr = new int[n];
            int temp;
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            for(int i=0;i<n-1;i++){
                for(int j=1; j < n-i; j++){
                    if(arr[j-1]>arr[j]){
                        temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;  
                    }
                }
            }
            if (n%2 == 0){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        else{
            System.out.println("INVALID_INPUT");
        }
        
    }
}
