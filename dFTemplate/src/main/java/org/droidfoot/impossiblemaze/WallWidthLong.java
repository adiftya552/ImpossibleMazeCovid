package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallWidthLong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallWidthLong extends Walls
{
    /**
     * Act - do whatever the WallWidthLong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallWidthLong()
    {
        setImage("Brick.png");
        getImage().scale(getImage().getWidth() * 12, getImage().getHeight());
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
