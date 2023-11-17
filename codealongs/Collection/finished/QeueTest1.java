package codealongs.Collection.finished;
import java.util.*;

public class QeueTest1 {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        names.add("David");
        names.add("Maria");
        names.add("Tomas");
        names.add("Sophie");
        names.add("George");

        System.out.println(names);

        String nextInLine = names.poll();
        System.out.println("Next in line " + nextInLine);
        nextInLine = names.peek();
        System.out.println(nextInLine);

        names.offer("David");
        System.out.println(names);

        Deque<String> turordning2 = new LinkedList<>();

        turordning2.add("David");
        turordning2.add("Maria");
        turordning2.add("Tomas");
        turordning2.add("Sophie");
        turordning2.add("George");

        System.out.println(turordning2);

        turordning2.addFirst("John");
        turordning2.addLast("Sara");
        System.out.println(turordning2);

        turordning2.pollLast();
        System.out.println(turordning2);
    }
}
