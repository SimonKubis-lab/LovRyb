import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ryba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ryba extends Actor
{
    private int pocitadloMeskania;
    private int meskanie;
    /**
     * Act - do whatever the Ryba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ryba(){
        this.meskanie=5;
        this.pocitadloMeskania=0;
    }
    private int body;
    public Ryba(int body){
        this.body=body;
    }
    
    public int zjedz(){
        this.obnovRybu();
        return this.body;
    }
    
    protected void obnovRybu(){
        More more=(More) this.getWorld();
        more.removeObject(this);
    }
    public void act()
    {
       if(this.meskanie==this.pocitadloMeskania){
           if (this.jeNaKraji()) {
               this.turn(180);
           }
           this.move(1);
           this.pocitadloMeskania=0;
       } else{
           this.pocitadloMeskania+=1;
       }
       switch(this.getRotation()){
           case 0:{
               this.setImage("fish2.png");
               break;
           }
           case 180:{
               this.setImage("fish3.png");
               break;
           }
       }
    }
    public boolean jeNaKraji() {
        return this.getX() == this.getWorld().getWidth()-1 || this.getX() == 0;
    }
}
