import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of integer array:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter the element for position "+i+" :");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        for(int i=0;i<a-1;i++)
        {
           int smallest=i;
           for (int j=i+1;j<a;j++)
           {
               if(arr[smallest]>arr[j])
               {
                   smallest=j;

               }
           }
           int t=arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=t;


        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}