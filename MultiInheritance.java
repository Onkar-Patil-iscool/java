class A{
    void display(){
        System.out.println("A's method");
    }
}

class B extends A{
    void show(){
        System.out.println("B's method");
    }
}

class C extends B{
    void printIt(){
        System.out.println("C's method");
    }
}
public class MultiInheritance{
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        
    }
}
