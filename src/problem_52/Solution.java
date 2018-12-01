package problem_52;

public class Solution {
    public int[] multiply(int[] A) {
        if(A==null)
            return null;
        int[] result=new int[A.length];
        result[0]=1;
        for(int i=1;i<A.length;i++){
            result[i]=result[i-1]*A[i-1];
        }
        int temp=1;
        for(int i=A.length-2;i>=0;i--){
            temp*=A[i+1];
            result[i]*=temp;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result=new Solution().multiply(new int[]{1,2,3,4});
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
