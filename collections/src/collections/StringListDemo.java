package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StringListDemo {
    public static void printAll(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        System.out.println("Elements in the list:");
        printAll(stringList);
    }
}