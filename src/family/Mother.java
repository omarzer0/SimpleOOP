package family;


public class Mother extends Person{

    public Mother(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }
    

    @Override
    public void sayAge(){
        System.out.println("Mother Class \t\thi i am "+age+" Years old");
    }
    public void sayName(String Hi){
        System.out.println(Hi+" Mother Class \tI am "+name);
    }
}
