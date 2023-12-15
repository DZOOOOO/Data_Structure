package javaPractice.poly.ex6;

public class Dog extends AbstractAnimal implements Fly{
    @Override
    void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void fly() {

    }
}
