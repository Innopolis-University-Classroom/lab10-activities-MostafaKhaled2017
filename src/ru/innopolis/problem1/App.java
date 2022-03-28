public class App {
    public static void main(String[] args) throws Exception {
        ShapesFactory factory = new ShapesFactory();
        Circle c = (Circle) factory.createShape("Circle");
        c.draw();
    }
}
