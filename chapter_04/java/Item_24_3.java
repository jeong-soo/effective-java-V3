package chapter_04.java;

public class Item_24_3 {

    public static void main(String[] args) {
        Animal human = new Animal() {
            @Override
            public void walk() {
                System.out.println("두발로 걷는다.");
            }
        };

        Animal dog = () -> System.out.println("네발로 걷는다.");
    }

}

interface Animal {
    void walk();
}