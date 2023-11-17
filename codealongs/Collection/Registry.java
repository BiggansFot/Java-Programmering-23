package codealongs.Collection;

import java.util.*;

public class Registry {
    public static void main(String[] args) {
        Map<Integer, Employee> registry = new HashMap<>();

        registry.put(2056, new Employee("Dave", 35));
        registry.put(3856, new Employee("Maria", 25));
        registry.put(4826, new Employee("Eric", 29));
        registry.put(1748, new Employee("Nancy", 43));
        registry.put(3715, new Employee("Clara", 27));

        System.out.println(registry.keySet());
        System.out.println(registry.values());

        System.out.println("Employee's over 30:");
        // for (int id : registry.keySet()) {
        //     Employee e = registry.get(id);
        //     if (e.age > 30) System.out.println(e.name);
        // }
        
        for (Employee e : registry.values()) {
            if (e.age > 30) System.out.println(e.name);
        }

        registry.keySet().forEach((key) -> System.out.println(registry.get(key).name));


    }
}
