class A{
    void display(){
        System.out.println("this is class A method");
    }
}

class B extends A{
    void display(){
        System.out.println("this is  class B method");
    }

}

public class PolymorphismDemo{
    public static void main(String args[]){
        A obj = new B();
        obj.display();
    }
}
