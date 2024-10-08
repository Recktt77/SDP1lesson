package ass3;

// ass3.Renderer interface
interface Renderer {
    void renderShape(String shape);
}
// Windows renderer implementation
class WindowsRenderer implements Renderer {
    public void renderShape(String shape) {
        System.out.println("Rendering " + shape + " on Windows.");
    }
}
// Linux renderer implementation
class LinuxRenderer implements Renderer {
    public void renderShape(String shape) {
        System.out.println("Rendering " + shape + " on Linux.");
    }
}
// Abstract shape class
abstract class Shape1 {
    protected Renderer renderer;
    Shape1(Renderer renderer) {
        this.renderer = renderer;
    }
    abstract void draw();
}
// ass3.Circle shape
class Circle1 extends Shape1 {
    Circle1(Renderer renderer) {
        super(renderer);
    }
    void draw() {
        renderer.renderShape("ass3.Circle");
    }
}
// ass3.Square shape
class Square extends Shape1 {
    Square(Renderer renderer) {
        super(renderer);
    }
    void draw() {
        renderer.renderShape("ass3.Square");
    }
}
// Client code
public class MainBridgeTask {
    public static void main(String[] args) {
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();
        Shape1 circle = new Circle1(windowsRenderer);
        Shape1 square = new Square(linuxRenderer);
        circle.draw(); // Rendering ass3.Circle on Windows
        square.draw(); // Rendering ass3.Square on Linux
    }
}
