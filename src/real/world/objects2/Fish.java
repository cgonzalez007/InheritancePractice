
package real.world.objects2;

/**
 *
 * @author cgonz
 */
public abstract class Fish extends Animal {

    // All Fish have a length from their snout to their tail
    private double lengthFromSnoutToTail;

    // Dictating that all fish have some sort of fin classification
    public abstract String getFinClassification();

    public abstract void setFinClassification(String finClassification);

    // All fish have their own way of swimming 
    public abstract void swim();

    public final double getLengthFromSnoutToTail() {
        return lengthFromSnoutToTail;
    }

    public final void setLengthFromSnoutToTail(double lengthFromSnoutToTail) {
        //requires validation
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

}
