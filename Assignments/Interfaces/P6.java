public class P6 {
    public static void main(String[] args) {
        Rectangle3 rec = new Rectangle3(23, 34);
        rec.showDimensions();
        rec.resizeHeight(34);
        rec.resizeWidth(56);
        rec.showDimensions();
    }
}

interface Resizable {
    public void resizeWidth(int width);

    public void resizeHeight(int height);
}

class Rectangle3 implements Resizable {
    int height;
    int width;

    Rectangle3(int width, int height) {
        this.height = height;
        this.width = width;

    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;

    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;

    }

    public void showDimensions() {
        System.out.println("Width: " + this.width + ", Height: " + this.height);
    }
}