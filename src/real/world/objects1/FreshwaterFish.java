
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public abstract class FreshwaterFish implements Fish {

    private String name;
    private String finClassification;
    private double lengthFromSnoutToTail;

    public FreshwaterFish(String name, String finClassification, double lengthFromSnoutToTail) {
        this.name = name;
        this.finClassification = finClassification;
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

    public FreshwaterFish() {
    }

    public abstract void takeInFreshwater();

    @Override
    public double getLengthFromSnoutToTail() {
        return lengthFromSnoutToTail;
    }

    @Override
    public void setLengthFromSnoutToTail(double lengthFromSnoutToTail) {
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

    @Override
    public String getFinClassification() {
        return finClassification;
    }

    @Override
    public void setFinClassification(String finClassification) {
        //requires validation
        this.finClassification = finClassification;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
