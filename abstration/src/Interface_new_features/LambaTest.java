package Interface_new_features;

public class LambaTest {

    public static void main(String[] args) {

        
        Test t1 = (a, b, c) -> a + b + c;  
        Test t2 = (a, b, c) -> a * b * c;  
        int num1 = 5;
        int num2 = 10;
        int num3 = 2;

        int sumResult = t1.myFunction(num1, num2, num3);
        int productResult = t2.myFunction(num1, num2, num3);

        System.out.println("Sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sumResult);
        System.out.println("Product of " + num1 + ", " + num2 + ", and " + num3 + " is: " + productResult);
    }
}

interface Test {
    int myFunction(int a, int b, int c);
}
