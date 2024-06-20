package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Human human = new Human();
        human.move();

        Human human2 =new Human();
        human2.move();

        Animal animal =new Animal();
        animal.move();

        Human human3 =new Human();
        human3.move(); // = human.move(),
    }
}
