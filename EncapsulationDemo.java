public class EncapsulationDemo {
    private String name;

    public String getName() {
        return name;
    }

   public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        EncapsulationDemo e1 =new EncapsulationDemo();
        
        e1.setName("onkar");
        System.out.println(e1.getName());
        

    }
}
