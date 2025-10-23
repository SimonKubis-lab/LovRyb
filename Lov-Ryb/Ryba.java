import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ryba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ryba extends Actor
{
    private int body;
    private int casDoOdplavania;
    
    public Ryba(int body, int casDoOdplavania, boolean ideVlavo) {
        this.body = body;
        this.casDoOdplavania = casDoOdplavania;
        if (ideVlavo) {
            this.setRotation(180);
            this.zmenObrazok();
        }
    }
    
    /**
     * Act - do whatever the Ryba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.hybSa();
        this.zmenObrazok();
        if (!this.getWorld().getObjectsAt(this.getX(), this.getY(), Hrac.class).isEmpty()) {
            More m = (More) this.getWorld();
            m.rybaZjedena(this);
            return;
        }
        this.casDoOdplavania--;
        if (this.casDoOdplavania == 0) {
            this.getWorld().removeObject(this);
        }
    }
    
    private void hybSa() {
        this.move(1);
        if (this.getX() == 0 || this.getX() == this.getWorld().getWidth() - 1) {
            this.turn(180);
        }
    }
    
    private void zmenObrazok() {
        if (this.getRotation() == 0) {
            this.setImage("fish2.png");
        } else if (this.getRotation() == 180) {
            this.setImage("fish3.png");
        }
    }
    
    public int dajBody() {
        return this.body;
    }
}
