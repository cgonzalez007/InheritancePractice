
package imaginary.objects1;

/**
 *
 * @author cgonz
 */
public class Rectangle implements ConvexQuadrilateral {

    // rectangles have a length and width which are used to find area and
    // perimeter
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public final double calcArea() {
        return getLength() * getWidth();
    }

    @Override
    public final double calcPerimeter() {
        return (2 * getLength()) + (2 * getWidth());
    }

    public final double getLength() {
        return length;
    }

    public final void setLength(double length) {
        //requires validation
        this.length = length;
    }

    public final double getWidth() {
        return width;
    }

    public final void setWidth(double width) {
        //requires validation
        this.width = width;
    }

}
