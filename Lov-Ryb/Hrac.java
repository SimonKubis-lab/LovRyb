import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hrac extends Actor
{
    /**
     * Act - do whatever the Hrac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("w")){
            this.setRotation(270);
            this.move(1);
        }else if(Greenfoot.isKeyDown("s")){
            this.setRotation(90);
            this.move(1);
        }else if(Greenfoot.isKeyDown("d")){
            this.setRotation(0);
            this.move(1);
        }else if(Greenfoot.isKeyDown("a")){
            this.setRotation(180);
            this.move(1);
        }
    }
}
