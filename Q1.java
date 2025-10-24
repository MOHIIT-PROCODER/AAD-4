
import java.util.Scanner;

public class Q1 {
    public static void iselction(int a[])
    {
        if (a.length==0 || a.length==1)
        {
            System.out.println("array is sorted");
        }
boolean accending=true;
boolean decending=true;
for(int i=0;i<a.length-1;i++)
{
    if(a[i]>a[i+1])
    {
        accending=false;
    }
    if(a[i]<a[i+1])
    {
        decending=false;
}

}

if(accending)
{
    System.out.println("array is sorted in accending order");
}
else if(decending)
{
    System.out.println("array is sorted in decending order");
}
else
{
    System.out.println("array is not sorted");
}
    }
    
    public static void main(String[] args)
  {
    int arr1[]={1,2,3,4,5};
     int arr2[]={5,4,3,2,1};
      int arr3[]={45};
      iselction(arr1);
      iselction(arr2);
      iselction(arr3);
  }
    
}
