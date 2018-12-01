package problem_20;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return result;
        int k=0;
        int sum=matrix.length*matrix[0].length;
        int startRow=0,startCol=0;
        int endRow=matrix.length-1,endCol=matrix[0].length-1;
        int i=startRow,j=startCol-1;
        int up=1,down=2,left=3,right=4;
        int direction=right;
      //  System.out.print(matrix[i][j]);
       // result.add(matrix[i][j]);
        while(k<sum){
            switch (direction){
                case 1:
                    i--;
                    if (i==startRow) {
                    direction=right;
                    startCol++;
                    }
                 //   else
                    break;
                case 2:
                    i++;
                    if (i==endRow){
                        direction=left;
                        endCol--;
                    }//else
                      //  i++;
                    break;
                case 3:
                    j--;
                    if (j==startCol){
                        direction=up;
                        endRow--;
                    }
                   // else
                    //    j--;
                    break;
                case 4:
                    j++;
                    if (j==endCol){
                        direction=down;
                        startRow++;

                    }
                 //   else
                  //      j++;
                    break;
            }
            System.out.print(matrix[i][j]+" ");
            result.add(matrix[i][j]);
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        new Solution().printMatrix(matrix);
    }
}
