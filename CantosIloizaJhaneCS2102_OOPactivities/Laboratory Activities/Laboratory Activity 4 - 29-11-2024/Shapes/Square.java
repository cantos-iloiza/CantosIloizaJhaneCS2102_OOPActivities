class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void printShapeType() {
        System.out.println("Square");
    }
}
