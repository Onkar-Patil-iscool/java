 interface A {//Interfaces themselves are abstract by nature,
    //  so writing abstract interface is also redundant.
    // instead write interface A simply 

    void demo();   
}

class B implements A{
    public void demo(){
        System.out.println("this is demo interface method");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.demo();
    }
    
}
