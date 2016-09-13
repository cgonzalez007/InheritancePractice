
package real.world.objects2;

/**
 *
 * @author cgonz
 */
public abstract class Fish extends Animal {

    // All Fish have some sort of fin classification as well as a length 
    // from their snout to their tail
    private String finClassification;
    private double lengthFromSnoutToTail;

    // All fish have their own way of swimming 
    public abstract void swim();

    public double getLengthFromSnoutToTail() {
        return lengthFromSnoutToTail;
    }

    public void setLengthFromSnoutToTail(double lengthFromSnoutToTail) {
        //requires validation
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

    public String getFinClassification() {
        return finClassification;
    }

    public void setFinClassification(String finClassification) {
        //requires validation
        this.finClassification = finClassification;
    }

}
