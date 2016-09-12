
package real.world.objects2;

/**
 *
 * @author cgonz
 */
public abstract class Fish extends Animal {

    private String finClassification;
    private double lengthFromSnoutToTail;

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

    @Override
    public void breathe() {
        System.out.println("I Breathe through my gills");

    }

}
