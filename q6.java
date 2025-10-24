public class q6 {
    public static int maxapper(int arr[])
    {
        int max=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int curcount=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    curcount++;
                }
            }
            if(curcount>count)
            {
                count=curcount;
                max=arr[i];
            }
    }
    return max;
}   
    
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,2,5,2,3,4,5,5,5,5};
        int result=maxapper(arr1);
        System.out.println(result);

    }
    
}
