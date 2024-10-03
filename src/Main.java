public class Main {
    public static void main(String[] args) {
        Printable object1 = createObject("2");
        Printable object2 = createObject("3");
        Printable object3 = createObject("4");


        Printable[] objects = {object1, object2, object3};

        for (Printable obj : objects) {
            obj.print();
        }


    }

    public static Printable createObject(String className) {
        switch (className) {
            case "2":
                return new ChildClass1("Eva", 3000);
            case "3":
                return new ChildClass2("Adam", "166 Earth");
            case "4":
                return new ChildClass3("Kaine", 50000);
            default:
                System.out.println("no info");
        }
        return null;
    }
}