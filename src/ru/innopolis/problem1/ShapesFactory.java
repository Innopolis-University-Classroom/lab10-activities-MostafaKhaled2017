public class ShapesFactory {
    public Shape createShape(String shapeName) {
        if (shapeName == null)
            return null;

        switch (shapeName) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape :  " + shapeName);
        }
    }
}
