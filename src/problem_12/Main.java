package problem_12;

public class Main {
    public void print1ToMaxOfDigits(int n){
        int[] num=new int[n];
        help(num,0);
    }
    public void help(int[] num,int k){
        if (k>=num.length) {
            for (int j=0;j<num.length;j++)
                System.out.print(num[j]);
            System.out.println();
            return;
        }
        for (int i=0;i<10;i++){

            num[k]=i;
            help(num,k+1);

        }

    }

    public static void main(String[] args) {
        new Main().print1ToMaxOfDigits(2);
    }
}
