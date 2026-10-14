public class Recursion {
    public static void printDec(int n){
        if(n==1){
        System.out.print(n+" ");
        return;}
 System.out.print(n+" ");
    printDec(n-1);
    }

    public static void PrintInc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        PrintInc(n-1 );
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        PrintInc(n);
    }
   
}
