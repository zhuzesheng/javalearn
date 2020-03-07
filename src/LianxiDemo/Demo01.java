package LianxiDemo;

public class Demo01 {
    public static void main(String[] args) {
        Person p = new Child();

        p.eat();
    }
}
abstract class Person{
    public abstract void eat();
}
class Child extends Person{
    public void eat(){
        System.out.println("eat something");
    }
}