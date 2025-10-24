public class q4 {
    public static int missing(int a[],int n)
    {
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
       int [] arr1={1,2,3,5};
        int n=arr1.length+1;
        int result=missing(arr1,n);
        System.out.println(result);
    }

    
}
