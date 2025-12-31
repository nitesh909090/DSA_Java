package array;
public class countellemtary {
    public static void main(String[] args)
    {
        int arr[]={1,4,2,3,4,4,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==4){
                count++;

            }
          
        }
          System.out.println(count);
    }
}
