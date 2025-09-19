abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int m1, m2, m3;
    A(int a, int b, int c) {
        m1 = a; m2 = b; m3 = c;
    }
    double getPercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}

class B extends Marks {
    int m1, m2, m3, m4;
    B(int a, int b, int c, int d) {
        m1 = a; m2 = b; m3 = c; m4 = d;
    }
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}

public class MarksDemo {
    public static void main(String[] args) {
        A a = new A(80, 70, 90);
        B b = new B(85, 75, 65, 95);
        System.out.println("Student A Percentage: " + a.getPercentage());
        System.out.println("Student B Percentage: " + b.getPercentage());
    }
}
