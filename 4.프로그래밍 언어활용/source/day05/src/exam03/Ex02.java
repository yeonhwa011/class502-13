package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Animal[]animals ={new Human(),new Bird(),new Tiger()};


        for (Animal animal :animals){
            animal.move();

            if(animal instanceof Human) {
                Human human =(Human)animal;
                human.reading();
            } else if (animal instanceof Tiger) {
                Tiger tiger =(Tiger) animal;
                tiger.hunting();

            }

        }
    }
}
