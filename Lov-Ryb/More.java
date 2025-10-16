import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class More extends World
{
    private Hrac hrac;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public More()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 9, 100); 
        this.hrac = new Hrac();
        this.addObject(this.hrac,1,1);
        this.addObject(new Ryba(10),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
    }
}
