
package imaginary.objects1;

/**
 *
 * @author cgonz
 */
public class Square implements ConvexQuadrilateral {
    //Did not inherit from Rectangle class because length and width will always
    // be the same no matter what

    //length for each side is always equal to one another
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
