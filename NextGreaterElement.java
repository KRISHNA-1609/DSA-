//Stack important problem
//next greater right
// Time Complexity: O(n)
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {4,8,6,10,9,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[]= new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            //1. while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            //2. if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }

            //3. push in s
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}

/*  2)
 next greater left : just change the condition of for loop i.e 
 it starts from 0 and end at arr.length-1        */

 /*   3) next smaller right
   just change the condition in while loop i.e arr[s.peek()]>=arr[i]
  */

  /*  4)
   next smaller left : Reverse for loop and reverse the condition of while loop
   */