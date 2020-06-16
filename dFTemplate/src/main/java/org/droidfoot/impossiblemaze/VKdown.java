package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VKdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VKdown extends VirtualKey
{
    /**
     * Act - do whatever the VKdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VKdown(){
        setImage("DOWN-KEY.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            MyWorld mw = (MyWorld) getWorld();
            Player playerDoctor = mw.getPlayer();
            playerDoctor.virtualKey("down");
        }
    }    
}
