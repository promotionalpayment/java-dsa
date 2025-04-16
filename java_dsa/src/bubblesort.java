import java.util.Scanner;
public class bubblesort {
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
            for (int j=0;j<a-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }

            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}