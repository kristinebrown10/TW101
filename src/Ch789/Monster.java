package Ch789;

/**
 * Created by KBrown on 7/15/14.
 * Monster interface
 */
public interface Monster {
    public void takeDamage(int amount);
    public String name();
    public int currentHitpoints();
}
