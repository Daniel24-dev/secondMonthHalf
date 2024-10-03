class ChildClass3 extends BaseClass implements Printable {
    private double salary;

    public ChildClass3(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("ChildClass3 - Name: " + getName() + ", Salary: " + salary);
    }
}