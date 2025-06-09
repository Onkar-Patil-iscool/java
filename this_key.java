class this_key{
    String name;
    int age;
    void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public static  void main (String args [])
    {
        this_key obj = new this_key();
        obj.name="xyz";
        obj.age=21;
        obj.printinfo();
        
    }

}
