public class DecimalToBinary {

    public static void BinaryToDecimal(int binNum){
        int mynum=binNum;
        int pow=0;
        int decnum=0;
        while(binNum>0){
            int lastdigit = binNum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+mynum+"="+decnum);
    }
    public static void DecimalToBinary(int n){
          int mynum=n;
          int pow=0;
          int binNum=0;
          
        while(n>0){
            int rem = n%2;
            
             binNum = binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of "+ mynum+"="+binNum);
    }
    public static void main(String[] args) {
       DecimalToBinary(5);
       BinaryToDecimal(101);
    }
}
