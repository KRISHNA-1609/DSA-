import java.util.ArrayList;
public class ArraylistOperations {
    public static void main(String[] args) {
        // ClassName objectname = new ClassName();
         ArrayList<Integer> list = new ArrayList<>();

         //Add Operation
         list.add(2);    //O(1)
         list.add(5);
         list.add(9);
         list.add(6);
         list.add(8);

        // FIND MAXIMUX OF ARRAYLIST
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }
        System.out.println("max element = "+ max);



        //  list.add(1,9);
        //  System.out.println(list);


        //  // PRINT SIZE
        //  System.out.println(list.size());

        //  // Print the arraylist using iterator
        //  for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        //  }
        //  System.out.println();

        //  // Get Operation - O(1)
        //  int element = list.get(2);
        //  System.out.println(element);

        //  //Delete  - O(n)
        //  list.remove(2);
        //  System.out.println(list);

         // Set
        //  list.set(2, 10);
        //  System.out.println(list);

        //  // Contains
        //  System.out.println(list.contains(1));
        //  System.out.println(list.contains(11));

        // // Print reverse of an arraylist  -O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();


       

    }
   
}
