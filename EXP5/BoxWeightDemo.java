class Box {
    float width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(float w, float h, float d) {
        width = w; height = h; depth = d;
    }

    Box(Box b) {
        width = b.width; height = b.height; depth = b.depth;
    }

    float volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight b) {
        super(b);
        weight = b.weight;
    }

    void display() {
        System.out.println("Volume: " + volume());
        System.out.println("Weight: " + weight);
    }
}

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight(2, 3, 4, 5);
        bw1.display();
        BoxWeight bw2 = new BoxWeight(bw1);
        bw2.display();
    }
}
