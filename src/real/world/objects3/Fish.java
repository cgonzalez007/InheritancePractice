
package real.world.objects3;

/**
 *
 * @author cgonz
 */
public class Fish extends Animal {

    // All Fish have some sort of fin classification as well as a length 
    // from their snout to their tail
    private String finClassification;
    private double lengthFromSnoutToTail;

    // ****NOTE****
    //This is exactly why concrete classes as super classes is a BAD idea. 
    //This will need to be overridden
    // All fish have their own way of swimming 
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
