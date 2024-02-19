// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends LinkedLists {
    public static void main(String[] args) {
        LinkedLists linkedLists = new LinkedLists();

        //Print Merged LinkedList of two sorted LinkedList;
        for (int a : MergeTwoSortedLinkedList.mergeUnSortedList(linkedLists.sortedList_1, linkedLists.sortedList_2)) {
            System.out.print(a + ", ");
        }
    }
}