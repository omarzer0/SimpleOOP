package family;

public class Father extends Person{

    public Father(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }
    
    @Override
    public void sayAge(){
        System.out.println("Father Class \t\thi i am "+age+" Years old");
    }

    public void sayName(String Hi){
        System.out.println(Hi+" Father Class \tI am "+name);
    }
}
