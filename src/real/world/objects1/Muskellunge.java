
package real.world.objects1;

/**
 *
 * @author cgonz
 */
public class Muskellunge extends FreshwaterFish {
    // Certain muskie have certain patterns on their bodies
    // ex: spotted, tiger stripes, barred

    private String geneticVariation;
    private String muskieBodyPattern;
    private String finClassification;

    public Muskellunge(String geneticVariation, String muskieBodyPattern, String finClassification) {
        this.geneticVariation = geneticVariation;
        this.muskieBodyPattern = muskieBodyPattern;
        this.finClassification = finClassification;
    }
    
    public final String getMuskieBodyPattern() {
        return muskieBodyPattern;
    }

    public final void setMuskieBodyPattern(String muskieBodyPattern) {
        //requires validation
        this.muskieBodyPattern = muskieBodyPattern;
    }

    @Override
    public final void swim() {
        System.out.println("I swim horizontally and use my fins");
    }

    @Override
    public final void searchForFood() {
        System.out.println("I search for small fish and small animals including"
                + " birds and frogs");
    }

    @Override
    public final void takeInFreshwater() {
        System.out.println("I'm taking in Freshwater since I'm a freshwater "
                + "fish");
    }

    @Override
    public final void takeInOxygen() {
        System.out.println("I take in oxygen through the use of my gills.");

    }

    @Override
    public final String getGeneticVariation() {
        return geneticVariation;
    }

    // Muskie variations are determined by their body patterns
    @Override
    public final void setGeneticVariation(String geneticVariation) {
        //requires validation!
        this.geneticVariation = geneticVariation;
    }

    // Certain Muskie have different fin patterns. 
    // Ex: Spotted Muskie tend to have pointier tails compared to a Tiger Muskie
    @Override
    public final String getFinClassification() {
        return finClassification;
    }

    @Override
    public final void setFinClassification(String finClassification) {
        this.finClassification = finClassification;
    }

}
