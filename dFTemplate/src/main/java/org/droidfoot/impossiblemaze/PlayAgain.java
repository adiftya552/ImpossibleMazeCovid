package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Button
{
    /**
     * Act - do whatever the PlayAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayAgain(){
        setImage("PlayAgain-Button.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
