package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Actor
{
    int speed = 2;
    int collect = 0;

    private String arahPlayer="right ";
    private boolean onMove=false;



    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        autoMove();
        hitMasker();
        hitHandSanitizer();
        hitAPD();
        hitPintu();
        hitPintu2();
        Teleport();
        Teleport2();
        youWin();
        youLose();
    }
    
    public Player(){
        setImage("player.png");
    }

    public void autoMove(){
        if(onMove){
            if(arahPlayer.equalsIgnoreCase("up")){
                moving("up");
            }
            if(arahPlayer.equalsIgnoreCase("down")){
                moving("down");
            }
            if(arahPlayer.equalsIgnoreCase("right")){
                moving("right");
            }
            if(arahPlayer.equalsIgnoreCase("left")){
                moving("left");
            }
        }
    }

    public void moving(String arah){
        if(arahPlayer.equalsIgnoreCase("up")){
            setLocation(getX(), getY() - speed);
            if (hitWall() == true)
            {
                setLocation(getX(), getY() + speed);
            }
        }
        if(arahPlayer.equalsIgnoreCase("down")){
            setLocation(getX(), getY() + speed);
            if (hitWall() == true)
            {
                setLocation(getX(), getY() - speed);
            } 
        }
        if(arahPlayer.equalsIgnoreCase("right")){
            setLocation(getX() + speed, getY());
            if (hitWall() == true)
            {
                setLocation(getX() - speed, getY());
            }
        }
        if(arahPlayer.equalsIgnoreCase("left")){
            setLocation(getX() - speed, getY());
            if (hitWall() == true)
            {
                setLocation(getX() + speed, getY());
            }
        }
    }

    public void virtualKey(String key){
        if(key.equalsIgnoreCase("up")){
            onMove=true;
            arahPlayer = "up";
        }
        if(key.equalsIgnoreCase("down")){
            onMove=true;
            arahPlayer = "down";
        }
        if(key.equalsIgnoreCase("right")){
            onMove=true;
            arahPlayer = "right";
        }
        if(key.equalsIgnoreCase("left")){
            onMove=true;
            arahPlayer = "left";
        }
        if(key.equalsIgnoreCase("stop")){
            onMove=false;
        }
    }

    

    public boolean hitWall()
    {
        if (isTouching(Walls.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void hitMasker()
    {
        if(getOneIntersectingObject(Masker.class)!=null)
        {
            getWorld().removeObject(getOneIntersectingObject(Masker.class));
            speed++;
        }
    }

    public void hitHandSanitizer()
    {
        if(getOneIntersectingObject(Sanitizer.class)!=null)
        {
            getWorld().removeObject(getOneIntersectingObject(Sanitizer.class));
            speed++;

        }
    }

    public void hitAPD()
    {
        if(getOneIntersectingObject(apd.class)!=null)
        {
            getWorld().removeObject(getOneIntersectingObject(apd.class));
            speed++;
            collect++;
        }
    }

    public void hitPintu()
    {
        if(isTouching(Pintu.class))
        {
            setLocation(822,118);
        }
    }

    public void hitPintu2()
    {
        if(isTouching(Pintu2.class))
        {
            setLocation(308,125);
        }
    }

    public void Teleport()
    {
        if(isTouching(Teleport.class))
        {
            setLocation(834,38);
        }
    }

    public void Teleport2()
    {
        if(isTouching(Teleport2.class))
        {
            setLocation(202,562);
        }
    }

    public boolean hitVirus()
    {
        if(isTouching(Virus.class) || isTouching(VirusJaga.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void youLose()
    {
        if(hitVirus())
        {
            Greenfoot.setWorld(new GameOver());

        }
    }

    public void youWin()
    {
        if(isTouching(Winning.class) && collect == 4)
        {
            Greenfoot.setWorld(new WinGame());

        }
    }

}
