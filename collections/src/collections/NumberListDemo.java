package collections;
import java.util.ArrayList;

public class NumberListDemo {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();
        numberList.add(10);          
        numberList.add(15.5);        
        numberList.add(20.75f);      
        numberList.add(100L);
        System.out.println("Number List:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
