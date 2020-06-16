package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends Actor
{
    /**
     * Act - do whatever the Virus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Virus()
    {
        setImage("Virus.png");
        getImage().scale(getImage().getWidth() / 11 , getImage().getHeight() / 11);
    }
    public void act() 
    {
        moveAround();
    }    
    public void moveAround()
    {
        move(3);
        turn(3);
    }
}
