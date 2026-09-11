public class HalfPyramidPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//for this pattern just print (i) rather than (j)
/* 1
 * 22
 * 333
 * 4444
 * 55555
 */