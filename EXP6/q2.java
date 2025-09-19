interface X {
    void methodX();
}

interface Y extends X {
    void methodY();
}

class Test implements Y {
    public void methodX() {
        System.out.println("Method of X");
    }
    public void methodY() {
        System.out.println("Method of Y");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.methodX();
        t.methodY();
    }
}
