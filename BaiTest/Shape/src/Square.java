public class Square extends Rectangle {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public Square(float side) {
        this.side = side;
    }

    public Square() {
        this.side = 0;
    }

    @Override
    public void showHW() {
        System.out.printf("Side if square is: " + this.side + "\n");
    }

    @Override
    public void perimeter() {
        System.out.printf("Perimeter is: " + this.side * 4 + "\n");
    }

    @Override
    public void area() {
        System.out.printf("Area is: " + (this.side * this.side) + "\n");
    }

    @Override
    public void showInfor() {
        super.showInfor();
    }
}
