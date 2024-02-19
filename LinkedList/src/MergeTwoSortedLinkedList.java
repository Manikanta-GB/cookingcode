import java.util.LinkedList;

public class MergeTwoSortedLinkedList {
    protected static LinkedList<Integer> mergeUnSortedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> dummyList = new LinkedList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) < list2.get(index2)) {
                dummyList.add(list1.get(index1++));
            } else {
                dummyList.add(list2.get(index2++));
            }
        }
        while (index1 < list1.size()) {
            dummyList.add(list1.get(index1++));
        }
        while (index2 < list2.size()) {
            dummyList.add(list2.get(index2++));
        }
        return dummyList;
    }
}
