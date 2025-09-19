interface A {
    void show();
}

interface B {
    void display();
}

class Parent {
    void msg() {
        System.out.println("Parent class");
    }
}

class Child extends Parent implements A, B {
    public void show() {
        System.out.println("Interface A implemented");
    }

    public void display() {
        System.out.println("Interface B implemented");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.msg();
        c.show();
        c.display();
    }
}
