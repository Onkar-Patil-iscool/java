class Demo {
    void check(){
        int a =10;
         int b = 0;
         int c = a/b;
        System.out.println(c);
    } 
}
public class ExceptionDemo extends Demo{
    public static void main(String args[]){
        Demo obj =new Demo();
        obj.check();
     }
}
