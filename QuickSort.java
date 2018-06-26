import java.lang.*;
import java.util.*;

public class QuickSort
{
    
    public static void sort(int array[])
    {
        quicksort(array,0,array.length-1);
    }

    private static void quicksort(int array[],int low,int high)
    {
        if(low < high)
        {
            int pivot = partition(array,low,high);
            quicksort(array,low,pivot-1);
            quicksort(array,pivot+1,high);
        }
    }

    
    private static int partition(int array[],int low,int high)
    {
     int pivot = array[high];
     int i = low-1;

        for(int j=low;j<=high-1;j++)
            if(array[j] <= pivot)
            swap(array,++i,j);
           
    swap(array,i+1,high);
    return i+1;
    }

    private static void swap(int array[],int i,int j)
    {
    int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        int A[] = new int[30];
        Random r = new Random();
        for(int i=0;i<A.length;i++)
        {
            A[i]=r.nextInt(100);
            System.out.print(" "+A[i]);
        }


        QuickSort qs = new QuickSort();
        qs.sort(A);

        System.out.println("\n");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(" "+A[i]);
        }



    }

}




