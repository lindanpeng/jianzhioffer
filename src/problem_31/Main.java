package problem_31;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,-2,3,10,-4,7,2,-5};
        int sum=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (sum>0){
                sum+=arr[i];
            }
            else {
                sum=arr[i];
            }
            if (sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
