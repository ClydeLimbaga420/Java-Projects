public class Kid extends Dad{
    private String name;
    private int age;

    void addValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayValue(String name) {
        System.out.println("Original Name: " + name);
    }

    void displayValue(int age) {
        System.out.println("Original Age: " + age);
    }

    void Add() {
        int num1 = 50;
        int num2 = 90;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public String getName() {
        return this.name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void Say() {
        System.out.print("Hello" + " ");
    }

    void kidSay() {
        System.out.println("Hello Dad");
    }

    @Override
    void Ask() {
        System.out.println("Add Numbers >> ");
    }

    void Study () {
        System.out.println("Studying...");
    }
    void Order () {
        System.out.println("I order you to study");
    }

}
