package array;
public class cheksortarray {
    public static void main(String[] args) {
        int arr[] = {1,2,30,4,5};
        int i;

        for(i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("sorted");
    }
}
