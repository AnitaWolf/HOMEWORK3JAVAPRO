import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    /** 1 уровень сложности: Task 1.
     Даны два ArrayList, элементы которых упорядочены.
     Объединить их в третий ArrayList,
     элементы которого тоже должны быть отсортированы.
     Example 1:
     Input: list1 = [1,2,4], list2 = [1,3,4]
     Output: [1,1,2,3,4,4]
     Example 2:
     Input: list1 = [], list2 = []
     Output: []
     Example 3:
     Input: list1 = [], list2 = [0]
     Output: [0]*/

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,3,4));
        ArrayList<Integer> ListArray = createArray(list1, list2);
        System.out.println(ListArray);


       // ArrayList<Integer> list3 = new ArrayList<>();
//        for (Integer integer : list1) {
//            list3.add(integer);
//        }
//        for (Integer integer : list2){
//            list3.add(integer);
//        }

        //Collections.sort(list3);
       // System.out.println(list3);

    }


    public  static  ArrayList<Integer> createArray( ArrayList<Integer> array,ArrayList<Integer> array1){
        ArrayList<Integer> list =new ArrayList<>();
        Iterator<Integer> it = array.iterator();
        Iterator<Integer> it1 = array1.iterator();

        while (it.hasNext()&&it1.hasNext()) {
                    list.add(it.next());
                    list.add(it1.next());
        }
        return list;
    }




}
