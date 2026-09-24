import java.util.*;
public class OddOrEven {
    public static void OddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String [] args){
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14 );
    }
}
