package family;


public class Family {


    public static void main(String[] args) {
        // the parent class
        Person person = new Person("person",100,true);
        person.sayName();
        person.sayAge();
        
        // add spaces
        System.out.println("\n");
        
        //1- the father class 
        Father father = new Father("father",50,true);
        father.sayName("hi all ");
        father.sayAge();
        
        // add spaces
        System.out.println("\n");
        
        //2- the son class
        Son son = new Son("son", 20, true);
        son.sayName("Hello ");
        son.sayAge();
        
        // add spaces
        System.out.println("\n");
        
        //3- mother class
        Mother mother = new Mother("mother", 40, false);
        mother.sayName("hellooo ");
        mother.sayAge();
    }
    
}
