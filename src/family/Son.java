
package family;


public class Son extends Person{

    public Son(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }
    
    @Override
    public void sayAge(){
        System.out.println("Son Class \t\thi i am "+age+" Years old");
    }
    public void sayName(String Hi){
        System.out.println(Hi +" Son Class \tI am "+name);
    }
}
