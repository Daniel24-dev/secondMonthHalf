class ChildClass2 extends BaseClass implements Printable {
    private String address;

    public ChildClass2(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("ChildClass2 - Name: " + getName() + ", Address: " + address);
    }
}
