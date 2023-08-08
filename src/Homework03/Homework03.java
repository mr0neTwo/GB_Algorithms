package Homework03;
import java.util.Random;

public class Homework03 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Random random = new Random();
        int length = 10;

        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Исходный список:");
        list.print();

        list.reverse();

        System.out.println("Развернутый список:");
        list.print();
    }
}


