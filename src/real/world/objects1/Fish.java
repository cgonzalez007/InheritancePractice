
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public interface Fish extends Animal {

    public abstract void swim();

    public String getFinClassification();

    public void setFinClassification(String finClassification);
    
    public void setLengthFromSnoutToTail(double lengthFromSnoutToTail);
    
    public double getLengthFromSnoutToTail();
}
