public class Main {
    public static void main(String[] args) {

        Square square = new Square(12);
        Rectangle rectangle = new Rectangle(10, 13);
        Triangle triangle = new Triangle(11, 13, 17);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        System.out.println("");
        shapeCollection.getPropertyValues();
    }
}