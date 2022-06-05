package IntLists;


public class IntArrayList implements IntList{

    public static int[] add(int[] list, int newElement) {
        int l=-1;
        for(int i=0; i< list.length;i++){
            if(list[i] == 0){
                l = i;
                break;
            }
        }
        if(l==-1){
            System.out.println("the array is full");
            int[] newList = new int[(l+(l/2))];
            for(int i=0;i< list.length;i++){
                newList[i] = list[i];
            }
            return newList;
        }else{
            System.out.println("the array isn´t full yet");
            list[l] = newElement;
            return list;
        }
    }



    public int[] remove(int[] list) {

        return new int[0];
    }


}
