public class LinearSearch {
    public static int LinearSearch(String menu[] , String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int numbers[] = {2,4,6,8,10,12,14,16,20};
         String menu[] = {"dosa","sandwich","pizza","Momos","kulcha"};
         String key="Momos";
         int index = LinearSearch(menu, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
        System.out.println("Key is at index:"+index);
    }
}
}