public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }

    @Override
    public void sound() {
        System.out.println("The cat meows");
    }

    @Override
    public void workout() {
        System.out.println("The cat is working out");
    }
    public static void main (String [] args){
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.sleep();
        cat1.workout();
        cat1.sound();
    }
}
