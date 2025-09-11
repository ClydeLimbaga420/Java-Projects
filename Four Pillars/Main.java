public class Main {
    public static void main(String[] args) {

    Kid clyde = new Kid();
    clyde.addValue("Pop",90);
    clyde.displayValue("Pop");
    clyde.displayValue(90);
    clyde.setAge(10);
    clyde.setName("Hoothoot");
    clyde.Say();
    System.out.println(clyde.getName());
    clyde.kidSay();
    System.out.println("I am " + clyde.getAge() + " years old");
    clyde.Order();
    clyde.Study();
    clyde.Ask();
    clyde.Add();


    }
}