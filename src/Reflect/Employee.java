package Reflect;

public class Employee {
    //Field
    private String name;
    //Constructor
    public Employee(){}
    public Employee(String name){
        this.name = name;
    }
    //方法
    public void work(){
        System.out.println("在工作");
    }
}
