
abstract class Eats {
     abstract void Eat();//empty method body could be defined,but the 
     //overriding in the child class becomes not compulsory.
     //as we defined the above method abstract ,now overriding becomes compulsory
     //also keeping methods empty is not a good practice
    }

class Animal extends Eats{
    void Eat(){
        System.out.println("Animal eats");//we overrided the abstract method
    }

}
 class AbstractDemo{
    public static void main(String[] args) {
        Animal an = new Animal();
        an.Eat();
    }
 }
