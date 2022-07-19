public class Rectangle {
    private float length;
    private float width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void showHW() {
        System.out.println("Height: " + getLength() + " " + "width: " + getWidth() + "\n");
    }

    public void perimeter() {
        System.out.printf("Perimeter is: " + (this.length + this.width) * 2 + "\n");
    }

    public void area() {
        System.out.printf("Area is: " + (this.length * this.width) + "\n");
    }

    public void showInfor() {
        showHW();
        perimeter();
        area();
    }
}
