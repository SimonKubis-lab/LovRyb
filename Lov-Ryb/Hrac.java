import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Hrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hrac extends Actor
{
    private int meskanie;
    private int pocitadloMeskania;
    private int body;
    private PocitadloBodov pocitadlo;
    /**
     * Act - do whatever the Hrac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hrac(){
    this.meskanie = 3;
    this.pocitadloMeskania = 0;
    }
    private void pohyb()
    {
        if(Greenfoot.isKeyDown("w")){
            this.setRotation(270);
            this.move(1);
        }else if(Greenfoot.isKeyDown("s")){
            this.setRotation(90);
            this.move(1);
        }else if(Greenfoot.isKeyDown("d")){
            this.setRotation(0);
            this.setImage("žralok.png");
            this.move(1);
        }else if(Greenfoot.isKeyDown("a")){
            this.setRotation(180);
            this.setImage("žralok 2.png");
            this.move(1);
        }
    }
    public void act(){
        
        if(this.pocitadloMeskania==this.meskanie){
            this.pohyb();
            this.pocitadloMeskania=0;
            this.skusZjestRybu();
        }else{
            this.pocitadloMeskania+=1;
        }
    }
     private boolean skusZjestRybu(){
        World More=this.getWorld();
        if(More.getObjectsAt(this.getX(), this.getY(), Ryba.class).isEmpty()){
            return false;
        }else{
            List<Ryba> rybu=More.getObjectsAt(this.getX(), this.getY(),Ryba.class);
            for(Ryba ryba: rybu){
                this.body+=ryba.zjedz();
                if(this.pocitadlo!=null){
                    this.pocitadlo.setValue(this.body);
                }
            }
            return true;
        }
    }
}
