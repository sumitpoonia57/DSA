import java.util.*;
//  ArrayList in Arraylist
public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        mainlist.add(0, list);
        mainlist.add(0, list1);

    for(int i=0;i<mainlist.size();i++){
         ArrayList currlist= mainlist.get(i);
         for(int j=0;j<currlist.size();j++){
            System.out.print(currlist.get(j));
         }
         System.out.println();
    }
    System.out.print(mainlist);


    }
    
}
