package problem_22;

import java.util.Stack;

public class Main {
    public static boolean isPopedSequence(int[] pushedArr,int[] input){
        Stack<Integer> stack=new Stack<>();
        int i=0,k=0;
        while (i<input.length){
        while (!stack.empty()&&stack.peek()==input[i]&&i<input.length) {
            stack.pop();
            i++;
        }
        if (k<pushedArr.length)
        stack.push(pushedArr[k++]);
        else break;
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,3,2,1};
        int[] arr3={4,3,5,1,2};
        System.out.println(isPopedSequence(arr1,arr2));
        System.out.println(isPopedSequence(arr1,arr3));


    }
}
