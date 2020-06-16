package org.droidfoot.impossiblemaze;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VKup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VKup extends VirtualKey
{
    /**
     * Act - do whatever the VKup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VKup(){
        setImage("UP-KEY.png");
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            MyWorld mw = (MyWorld) getWorld();
            Player playerDoctor = mw.getPlayer();
            playerDoctor.virtualKey("up");
        }
    }    
}
