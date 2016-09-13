
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public interface Fish extends Animal {

    // Dictating that all fish swim, but have their own way of doing so
    public abstract void swim();

    // Dictating that all fish have some sort of fin classification
    public abstract String getFinClassification();

    public abstract void setFinClassification(String finClassification);

    // Dictating that all fish have a length from their snout to their tail
    public abstract void setLengthFromSnoutToTail(double lengthFromSnoutToTail);

    public abstract double getLengthFromSnoutToTail();

}
