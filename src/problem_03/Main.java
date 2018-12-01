package problem_03;

public class Main {
    boolean findValue(int[][] matrix,int value){
        for (int i=matrix[0].length-1;i>=0;i--){
            for (int j=0;j<matrix.length;j++){
                if (matrix[j][i]==value)
                    return true;
                else if (matrix[j][i]>value){
                    i--;
                }
                else{
                    j++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(new Main().findValue(matrix,14));
    }
}
