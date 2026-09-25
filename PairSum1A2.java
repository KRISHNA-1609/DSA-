import java.util.ArrayList;
// 2 Pointer Approach for sorted array
//list = [1,2,3,4,5,6]; target =5
public class PairSum1A2 {
    public static boolean PairSum1A2(ArrayList<Integer>list,int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;

            }
            //case 2
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                //case3
                rp--;
            }
        }
        return false;
    }

    // pair sum in a sorted and rotated arraylist
    // list = [11,15,6,8,9,10], target =16; 
    public static boolean Pairsum2(ArrayList<Integer> list, int target){
        int bp=0;// breakpoint
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){ //breaking point
                bp=i;
                break;
            }
        }
        int lp = bp+1;//smallest
        int rp = bp;// largest

        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            else{
                //case3
                rp = (n+rp-1)%n;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1,2,3,4,5,6
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(Pairsum2(list,target));
    }
}
