
package imaginary.objects;

/**
 *
 * @author cgonz
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calcPerimeter() {
        return (2 * getLength()) + (2 * getWidth());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        //requires validation
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        //requires validation
        this.width = width;
    }

}
