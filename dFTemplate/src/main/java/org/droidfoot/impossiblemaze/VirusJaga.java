package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VirusJaga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VirusJaga extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the VirusJaga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VirusJaga()
    {
        setImage("Virus.png");
        getImage().scale(getImage().getWidth() / 12 , getImage().getHeight() / 12);
    }
    public void act() 
    {
        moveAround();
    }    
    public void moveAround()
    {
        setLocation(getX(),getY() + speed);
        if (isTouching(Walls.class))
        {
            speed = -speed;
        }
    }
}
