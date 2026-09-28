public class PrimesInRange {
     public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            }
            return isPrime;
        }
    public static void primesinrange(int n){
        
        for(int i=2;i<=n-1;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }

            }
            System.out.println();
        }
        public static void main(String[] args) {
            primesinrange(10);
        }
    }

