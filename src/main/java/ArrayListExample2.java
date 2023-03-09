import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample2 {


    /**
     * Task 2.
     * Пусть дан ArrayList нечетной длины.
     * Используя только Iterator
     * (не прибегая к индексам и длине списка),
     * вывести на экран элемент,
     * находящийся ровно посередине списка.
     * Example 1:
     * Input: list = [1,2,4]
     * Output: 2
     * Example 2:
     * Input: list = [1,2,3,4,5]
     * Output: 3
     * Example 3:
     * Input: list = [1]
     * Output: 1
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Iterator<Integer> it = list.iterator();
        ListIterator<Integer> it2 = list.listIterator(list.size());

        while (it.hasNext()&& it2.hasPrevious()){
            if (it.next()==it2.previous()){
                System.out.println(it2.next());
            }
        }

    }

}