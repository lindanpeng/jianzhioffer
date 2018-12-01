package problem_34;

import java.util.Scanner;

public class Main {
    public static int getUglyNumber(int index){
        int[] numbers=new int[index];
        numbers[0]=1;
        int p2=0;
        int p3=0;
        int p5=0;
        int i=0;
        while (i+1<index){
            int m=min(numbers[p2]*2,numbers[p3]*3,numbers[p5]*5);
            numbers[i+1]=m;
            while (numbers[p2]*2<=m)p2++;
            while (numbers[p3]*3<=m)p3++;
            while (numbers[p5]*5<=m)p5++;
            i++;
        }
        return numbers[index-1];
    }
    public static int min(int a,int b,int c){
        return Math.min(Math.min(a,c),b);
    }
    public static void main(String[] args) {
        System.out.println(getUglyNumber(1500));
    }
}
