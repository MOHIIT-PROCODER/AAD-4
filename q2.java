public class q2 {
    public static int smallele(int arr[])
    {
        int arrmin=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
if(arr[i]<arrmin)
{
    arrmin=arr[i];
}
        }
        return arrmin;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(smallele(arr));
    }
    
}
