public class Factorial {
    public static int factorial(int n){
        if(n==0){
return 1;
        }
        int fnm1 = factorial(n-1);// fact(n-1)
        int fn = n* fnm1;
        return fn;

    }

    // SUM OF FIRST N NATURAL NUMBERS
    public static int Calcsum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = Calcsum(n-1);// sum of n-1
        int sn = n+snm1;
        return sn;
    }

    // PRINT Nth FIBONACCI NUMBER
    public static int fibonacci(int n){
        // int fib0 = 0;
        // int fib1 = 1;
        if(n==0 || n==1){
            return n;
        }
        
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    // CHECK IF GIVEN ARRAY IS SORTED OR NOT
    public static boolean isSorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //FIRST OCCURENCE OF AN ELEMENT
    public static int Firstoccurence(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return Firstoccurence(arr, i+1, key);
    }

    // LAST OCCURENCE
    public static int Lastoccurence(int arr[],int key, int i){
        
        if(i==arr.length){
            return -1;
        }
        int isfound = Lastoccurence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
            return isfound;
        
    }

    // Print X power n
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
      /* int xnm1=  power(x, n-1);
      int xn = x*xnm1;
      return xn;                   */

      return x * power(x,n-1);

    }
    // MORE OPTIMISED METHOD
    public static int optimizedPower(int a, int n){// O(log(N))
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowersq = halfPower*halfPower;
        //n is odd
        if(n%2 !=0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
    //     int n=6; 
    //    System.out.println(fibonacci(n)); 
    // int arr[] = {8,3,6,9,5,10,2,5,3};
    // System.out.println(Lastoccurence(arr, 5, 0));
   // System.out.println(power(2, 10));
   int a = 2;
   int n = 10;
   System.out.println(optimizedPower(a, n));
    }
}
