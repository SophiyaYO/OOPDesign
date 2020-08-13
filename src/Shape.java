import java.awt.*;

abstract public class Shape {
    private Color color;

    public void darken() {/**/}

    public void draw(Graphics g) {
        g.setColor(color);
        render(g);
    }

    abstract protected void render(Graphics g);
}

class Circle extends Shape {
    private Point Center;
    private int radius;

    public void render(Graphics g) {

    }
}