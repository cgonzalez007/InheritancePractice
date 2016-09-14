
package real.world.objects3;

/**
 *
 * @author cgonz
 */
public class Fish extends Animal {

    // All Fish have some sort of fin classification as well as a length 
    // from their snout to their tail
    // ****NOTE**** 
    // These properties and their getters and setters should most likely 
    // be in the Muskellunge class. I purposely left them here to show why 
    // concrete classes shouldn't be used for super classes. 
    // They DO NOT allow abstract methods. Any concrete methods will get  
    // inherited invisibly
    
    private String finClassification;
    private double lengthFromSnoutToTail;

    public Fish(String finClassification, double lengthFromSnoutToTail) {
        this.finClassification = finClassification;
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

    // ****NOTE****
    //This is exactly why concrete classes as super classes is a BAD idea. 
    //This will need to be overridden
    // All fish have their own way of swimming 
    public void swim() {
        System.out.println("Unknown");
    }

    public final String getFinClassification() {
        return finClassification;
    }

    public final void setFinClassification(String finClassification) {
        //requires validation
        this.finClassification = finClassification;
    }

    public final double getLengthFromSnoutToTail() {
        return lengthFromSnoutToTail;
    }

    public final void setLengthFromSnoutToTail(double lengthFromSnoutToTail) {
        //requires validation
        this.lengthFromSnoutToTail = lengthFromSnoutToTail;
    }

}
