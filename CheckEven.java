import java.util.*;
public class CheckEven {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("enter an integer:");
        num=sc.nextInt();

        if(isEven(num)){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
}
