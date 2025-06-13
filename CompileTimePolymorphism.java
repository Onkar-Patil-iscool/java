class Animal{
    void Eat(){
        System.out.println("Animal eats grass");
    }

    void Eat(String food){
        System.out.println("Animal eats "+food);
    }
}

public class CompileTimePolymorphism{
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.Eat("Sugarcane");
    }


}

