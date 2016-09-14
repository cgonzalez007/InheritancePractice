
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public abstract class FreshwaterFish implements Fish {

    private double lengthFromSnoutToTail;

    // All Freshwater Fish take in Freshwater. Each type of freshwater fish 
    //might have their own specific way of doing so.
    public abstract void takeInFreshwater();

    @Override
    public final double getLengthFromSnoutToTail() {
        return lengthFromSnoutToTail;
    }

    @Override
    public final void setLengthFromSnoutToTail(double lengthFromSnoutToTail) {
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

}
