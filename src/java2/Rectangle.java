package java2;

public class Rectangle extends Shape{ //EXTENDS CHAMA A CLASSE ABSTRATA AI O PROGRAMA PEDE PARA VOCÊ COLOCAR O METODO

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    } //tem que implementar o método abstrato então tem que fazer um override do método área



}
