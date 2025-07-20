import java.util.concurrent.locks.ReentrantLock;
class Dog {
    String sound;
    boolean hasEaten;
}
public class Main {
    public static void main(String[] args) {
       Dog d = new Dog();
        System.out.println(d.hasEaten);
        System.out.println(d.sound);
    }
}