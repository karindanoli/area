package java2;

public abstract class Shape {

    public Shape(Color color) {
        this.color = color;
    }

    public Shape() {
    }

    public Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();


}
