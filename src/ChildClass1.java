class ChildClass1 extends BaseClass implements Printable {
    private int age;

    public ChildClass1(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("ChildClass1 - Name: " + getName() + ", Age: " + age);
    }
}