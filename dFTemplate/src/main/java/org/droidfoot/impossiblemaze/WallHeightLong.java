package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallHeightLong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallHeightLong extends Walls
{
    /**
     * Act - do whatever the WallHeightLong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallHeightLong()
    {
        setImage("Brick.png");
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() * 24);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
