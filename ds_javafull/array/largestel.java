package array;
public class largestel {
    public static int largestfun(int arr[]){
        int largeste=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largeste<arr[i]){
                largeste=arr[i];
                
            }
        
        }
        return largeste;
  }
  public static int minimumm(int arr[]){
 int minimum=arr[0];

for(int i=0;i<arr.length;i++){
    if(minimum>arr[i]){
        minimum=arr[i];

    }
}
return minimum;
  }
         
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60};
       int largest=largestfun(arr);
       System.out.println(largest);
       System.out.print(minimumm(arr));
    }
    
}
