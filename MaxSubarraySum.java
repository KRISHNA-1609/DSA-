public class MaxSubarraySum {
    public static void MaxSubarraySum(int numbers[]){
        int currSum =0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
               int end=j;
               currSum=0;
               for(int k=start;k<=end;k++){
                currSum += numbers[k];
               }
              System.out.println(currSum);
               if(maxsum<currSum){
                maxsum=currSum;
               }
            }
            
        }
        System.out.println("Max sum:"+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        MaxSubarraySum(numbers);
    }
}

