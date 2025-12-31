package array;
import java.util.Scanner;
public class input_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the arrys size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter size element: ");
        int i;
        for(i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        sc.close();
    }
}
