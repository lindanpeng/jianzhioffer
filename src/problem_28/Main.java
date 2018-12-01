package problem_28;

public class Main {
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void permutation(char[] arr,int k){
        if(k>=arr.length){
            for (int i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

            for (int j=k;j<arr.length;j++){
                swap(arr,j,k);
                permutation(arr,k+1);
                swap(arr,j,k);
        }
    }
    public static void main(String[] args) {
        Main.permutation(new char[]{'1','2','3'},0);
    }
}
