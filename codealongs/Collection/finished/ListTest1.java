package codealongs.Collection.finished;
import java.util.*;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Maria");
        names.add("Tomas");
        names.add("Sophie");
        names.add("George");

        System.out.println(names);

        names.add("David");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        List<String> otherNames = new ArrayList<>();
        otherNames.add("Ophelia");
        otherNames.add("Hamlet");
        otherNames.add("Sophie");

        System.out.println(Collections.disjoint(names, otherNames));

        int index = Collections.binarySearch(names, "Sophie");

        System.out.println(index);

        Collections.swap(names, index, 0);
        System.out.println(names);

        for(String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            
        }
    }
}
