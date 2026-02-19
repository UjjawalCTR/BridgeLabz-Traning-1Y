package Class_Examples;

public class Person {
    int x = 10;

    Person(){
        System.out.println("Person Constructor Called");
    }

    void show(){
        System.out.println("Person Method Called");
    }
}
class Employee extends Person {
    int x = 20;

    Employee() {
        super();
        System.out.println("Parent variable x = " + super.x);
        super.show();
        System.out.println("Employee Constructor Called");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
