package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu2 extends Button
{
    /**
     * Act - do whatever the MainMenu2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MainMenu2(){
        setImage("MenuUtama2-Button.png");
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new StartMenu());
        }
    }    
}
