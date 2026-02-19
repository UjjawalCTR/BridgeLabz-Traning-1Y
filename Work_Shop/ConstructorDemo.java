package Class_Examples;

public class ConstructorDemo {
    int id;
    String name;
    int age;

    public ConstructorDemo() {
        System.out.println("ConstructorDemo()");
    }
    public ConstructorDemo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        ConstructorDemo d= new ConstructorDemo();
        ConstructorDemo cd = new ConstructorDemo(1,"Jay",25);
        d.display();
        cd.display();
    }
}
