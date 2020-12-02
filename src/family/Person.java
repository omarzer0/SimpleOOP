package family;


public class Person {
    protected String name;
    protected int age;
    protected boolean isMale;

    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    
    public void sayAge(){
        System.out.println("Person Class \t\thi i am "+age+" Years old");
    }
    public void sayName(){
        System.out.println("Person Class \tI am "+name);
    }
}
