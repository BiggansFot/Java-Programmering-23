package exercises;

import java.util.Scanner;

class Walrus {
    String name;
    
    Walrus(String name) {
        this.name = name;
    }
    void introduce() {
        System.out.println("My name is " + name);
    }
}
public class WalrusLoop {
    public static void main(String[] args) {
        Walrus[] walrusArray = {new Walrus("What"), new Walrus("Who"), new Walrus("Chicka-chicka Slim Shady")};
        System.out.println("Hi!");
        for (Walrus w : walrusArray) {
            w.introduce();
        }
    }
}
