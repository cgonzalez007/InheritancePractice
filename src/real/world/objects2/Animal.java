
package real.world.objects2;

/**
 *
 * @author cgonz
 */
public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void breathe();

    public abstract void searchForFood();
}
