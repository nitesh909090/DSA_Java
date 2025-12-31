package array;
public class secondlgarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int first=arr[0];
        int second=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
              second=first;
              first=arr[i];
            }else
            if(arr[i]>second){
                if(arr[i]!=first){
                second=arr[i];
                }
            }

        }
         System.out.println(first);
         System.out.println(second);

    }
}
