
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public class Muskellunge extends FreshwaterFish {
    // Certain muskie have certain patterns on their bodies
    // ex: spotted, tiger stripes, barred
   
    private String muskieBodyPattern;
    
    public String getMuskieBodyPattern() {
        return muskieBodyPattern;
    }

    public void setMuskieBodyPattern(String muskieBodyPattern) {
        //requires validation
        this.muskieBodyPattern = muskieBodyPattern;
    }
    
    @Override
    public void swim() {
        System.out.println("I swim horizontally and use my fins");
    }

    @Override
    public void searchForFood() {
        System.out.println("I search for small fish and small animals including"
                + " birds and frogs");
    }

    @Override
    public void takeInFreshwater() {
        System.out.println("I'm taking in Freshwater since I'm a freshwater "
                + "fish");
    }

    @Override
    public void takeInOxygen() {
        System.out.println("I take in oxygen through the use of my gills.");

    }

}
