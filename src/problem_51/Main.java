package problem_51;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static int resolve(int[] arr){
        int i=0;
        while (i<arr.length){
            while (arr[i]!=-1){
                swap(arr,i,arr[arr[i]-1]);
            }
        }
        return 0;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        double a=Long.MAX_VALUE;
        System.out.println(Long.MAX_VALUE);
        System.out.println(new DecimalFormat("#,##0.00").format(a));
    }
}
