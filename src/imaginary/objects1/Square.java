
package imaginary.objects1;

/**
 *
 * @author cgonz
 */
public class Square implements Quadrilateral {

    private double lengthForEachSide;

    public Square(double lengthForEachSide) {
        this.lengthForEachSide = lengthForEachSide;
    }

    @Override
    public double calcArea() {
        return Math.pow(getLengthForEachSide(), 2);
    }

    @Override
    public double calcPerimeter() {
        return NUMBER_OF_SIDES * getLengthForEachSide();
    }

    public double getLengthForEachSide() {
        return lengthForEachSide;
    }

    public void setLengthForEachSide(double lengthForEachSide) {
        //requires validation
        this.lengthForEachSide = lengthForEachSide;
    }

}
