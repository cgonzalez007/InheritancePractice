
package real.world.objects3;

/**
 *
 * @author cgonz
 */
public class Fish extends Animal {

    private String finClassification;
    private double lengthFromSnoutToTail;

    //Exactly why concrete classes as super classes is BAD. 
    //These will need to be overridden
    public void swim() {
        System.out.println("Unknown");
    }

    public String getFinClassification() {
        return finClassification;
    }

    public void setFinClassification(String finClassification) {
        //requires validation
        this.finClassification = finClassification;
    }

    public double getLengthFromSnoutToTail() {
        return lengthFromSnoutToTail;
    }

    public void setLengthFromSnoutToTail(double lengthFromSnoutToTail) {
        //requires validation
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

}
