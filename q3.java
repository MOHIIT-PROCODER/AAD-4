public class q3 
{
    public static int duplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,2,5};

        int result=duplicate(arr1);
        System.out.println(result);
        
    }
}
