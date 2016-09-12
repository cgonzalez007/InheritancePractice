
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public interface Fish extends Animal {

    public abstract void swim();

    public abstract String getFinClassification();

    public abstract void setFinClassification(String finClassification);
    
    public abstract void setLengthFromSnoutToTail(double lengthFromSnoutToTail);
    
    public abstract double getLengthFromSnoutToTail();
    
}
