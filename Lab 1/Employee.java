// Assignment-2

class Employee {
    protected int id;
    protected String name;
    protected boolean isPermanent;
    protected int age;

    public static void main(String[] args) {
        System.out.println("Successfully started");


        Employee emp = new Employee();

        emp.id = 101;
        emp.name = "Sudeep Kumar Maurya";
        emp.isPermanent = true;
        
        emp.age = (int) 35.5; 

        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Is Permanent: " + emp.isPermanent);
        System.out.println("Age: " + emp.age);
    }
}
