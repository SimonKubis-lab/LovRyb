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
    private int casNaDalsiuRybu;
    private int pocitadloVytvoreniaRyby;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public More()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(12, 9, 100); 
        this.hrac = new Hrac();
        this.vytvorRybu();
        this.casNaDalsiuRybu = 200;
        this.pocitadloVytvoreniaRyby = 0;
        this.addObject(this.hrac,1,1);
        this.addObject(new Ryba(10, 200,false),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
    }
    public void act() {
        if (this.casNaDalsiuRybu == this.pocitadloVytvoreniaRyby) {
            this.vytvorRybu();
            this.casNaDalsiuRybu = 100 + Greenfoot.getRandomNumber(300);
            this.pocitadloVytvoreniaRyby = 0;
        } else {
            this.pocitadloVytvoreniaRyby++;
        }
    }
    private void vytvorRybu() {
        this.addObject(new Ryba(15, 150 + Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(2) == 0), Greenfoot.getRandomNumber(this.getHeight()), Greenfoot.getRandomNumber(this.getHeight()));
    }
    public void rybaZjedena(Ryba ryba) {
        this.hrac.pridajBody(ryba.dajBody());
        this.removeObject(ryba);
    }
}
