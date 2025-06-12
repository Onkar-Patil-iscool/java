class A{
    void display(){
        System.out.println("this is class A method");
    }
}

class B extends A{
    void show(){
        System.out.println("this is  class B method");
    }

}

public class InheritanceDemo{
    public static void main(String args[]){
        B obj = new B();
        obj.display();
    }
}